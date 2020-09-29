package controllers

import javax.inject.Inject
import java.io.File

import scala.xml.XML._
import scala.xml.Elem
import play.api.db.Database
import play.api.mvc.{BaseController, ControllerComponents}

import model._

/**
 * Контроллер для работы с входящим потоком данных
 * На вход получаем файлы формата xml и типом данных в названии
 * На выход отпарвляем необходимые данные в БД
 *
 * upload является GET контроллером, который выдает страницу с формой
 *
 * uploadPost является POST контроллером, который принимает файл и
 * отправляет страницу с результатом добавления файла и формой
 */
class UploadController @Inject()(db: Database, val controllerComponents: ControllerComponents) extends BaseController {
  // Интерфейс получения страницы с формой для загрузки данных
  def upload() = Action{
    Ok(views.html.upload(""))
  }

  // API для загрузки данных из xml файлов
  def uploadPost() = Action(parse.multipartFormData){
      // Получение файла из тела ответа
      request => request.body.file("file").map{file =>
      // Отправка в тело парсера
      parser(file.ref.toFile, file.filename.toString)
      Ok(views.html.upload("File upload"))
    // Если при получении файла произошла ошибка
    }.getOrElse{
      // Возвращаем форму с сообщением об ошибке
      Ok(views.html.upload("Error uploading file"))
    }
  }

  // Парсинг данных в формате xml
  private def parser(file: File, filename: String): Unit ={
    // Проверяем файл на тип данный по названию и отправляем на обработку

    // Вложенный метод перенаправления парсинга строки
    def redirect(dataType: String): Unit =
      for (a <- (loadString(loadFile(file).child.tail.head.toString()) \\ "row"))
        parseTag(loadString(a.toString()), dataType)

    // Если данные типа securities
    if(filename.indexOf("securities") != -1)
      redirect("security")

    // Если данные типа history
    if(filename.indexOf("history") != -1)
      redirect("history")
  }

  // Парсинг строки с данными
  private def parseTag(line: Elem, dataType: String): Unit ={
    dataType match {
      // Если тип security отправялем на добавление объект Security
      case "security" =>
        add(Security(line.attributes("secid").toString(),
                    line.attributes("regnumber").toString(),
                    line.attributes("name").toString(),
                    line.attributes("emitent_title").toString()))

      // Если тип history отправялем на добавлежние объект History
      case "history" =>
        add(History(line.attributes("SECID").toString(),
                    line.attributes("TRADEDATE").toString(),
                    ex(line.attributes("NUMTRADES").toString()).toDouble,
                    ex(line.attributes("OPEN").toString()).toDouble,
                    ex(line.attributes("CLOSE").toString()).toDouble))
    }

    // Проверка на пустоту возвращаемых double значений
    def ex(param: String): String ={
      if(param.isEmpty)
        "0"
      else
        param
    }
  }

  // Добавление данных в БД
  private def add(data: Data): Unit ={
    data match {
    // Добавление данных в таблицу security
      case Security(secid, regnumber, name, emitent_title) => {
        db.withConnection{conn =>
          // Проверка на наличие такой записи в securities
          if(!conn.createStatement().executeQuery(s"select * from securities where secid='$secid'").next())
            // Если такая запись не найдена добавление запись в securities
            conn.createStatement().executeUpdate(s"insert into securities " +
                                                  s"values ('$secid', '$regnumber', '$name', '$emitent_title')")
        }
      }
      // Добавление данные в таблицу history
      case History(secid, tradedate, numtrade, open, close) => {
        db.withConnection{conn =>
          // Проверка на наличие secid в таблице securities
          if(conn.createStatement().executeQuery(s"select * from securities where secid='$secid'").next()) {
            // Если найдена такая запись - добавляем в history
            conn.createStatement().executeUpdate(s"insert into history (secid, tradedate, numtrade, open, close) " +
                                                  s"values ('$secid', '$tradedate', $numtrade, $open, $close);")
          }
        }

      }
    }
  }
}
