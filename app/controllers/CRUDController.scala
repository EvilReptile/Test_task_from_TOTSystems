package controllers

import java.sql.ResultSet
import javax.inject.Inject

import scala.annotation.tailrec
import play.api.mvc.{BaseController, ControllerComponents}
import play.api.db._

import model._

/**
 * Контроллер реализации CRUD архитектуры
 * На вход принимает параметры и производит изменения или выдачу данных с БД
 *
 * select является GET контроллером, который выдает страницу с формой выбора записи в БД
 * selectPost является POST контроллером, который принимает параметр и выводит запись в БД по параметру
 *
 * delete является GET контроллером, который выдает страницу с формой для выбора записи для удаления в БД
 * deletePost является POST контроллером, который принимает параметр и удалаяет запись в БД по параметру
 *
 * update является GET контроллером, который выдает страницу с формой для выбора записи для обновления параметра
 * updatePost является POST контроллером, который выдает страницу с формой для обновления записи в БД по параметру
 *
 * insert является GET контроллером, который выдает страницу с формой для добавления записи в БД
 * insertPost является POST контроллером, который добавляет запись в БД по параметрам
 */
class CRUDController @Inject()(db: Database, val controllerComponents: ControllerComponents) extends BaseController {

  // Интерфейс для отображения формы для получения данных по записи в БД Security
  def select() = Action{
    Ok(views.html.select(getAllSec(), Security(null, null, null, null)))
  }

  // Интерфейс для вывода записи по параметру
  def selectPost() = Action{request =>
    Ok(views.html.select(getAllSec(), getSec(request.body.asFormUrlEncoded.get("security").head.toString())))
  }

  // Интерфейс для отображения формы для удаления данных по записи в БД Security
  def delete() = Action{
    Ok(views.html.delete(getAllSec()))
  }

  // Интерфейс для удаления записи по параметру
  def deletePost() = Action{request =>
    db.withConnection{conn =>
      conn.createStatement().executeUpdate("delete from securities where " +
                                            s"secid='${request.body.asFormUrlEncoded.get("security").head.toString}'")
    }
    Ok("Deletion completed successfully")
  }

  // Интерфейс для отображения формы для обновления данных по записи в БД Security
  def update(secid: String) = Action{
    Ok(views.html.update(getSec(secid), ""))
  }

  // Интерфейс для обновления данных записи по параметру
  def updatePost() = Action{request =>
    db.withConnection{conn =>
      conn.createStatement().executeUpdate(
                              "update securities set " +
                               s"regnumber='${request.body.asFormUrlEncoded.get("regnumber").head.toString}', " +
                               s"name='${request.body.asFormUrlEncoded.get("name").head.toString}', " +
                               s"emitent_title='${request.body.asFormUrlEncoded.get("emitent_title").head.toString}' " +
                              s"where secid='${request.body.asFormUrlEncoded.get("secid").head.toString}'")
    }
    Ok(request.body.asFormUrlEncoded.toString())
  }

  // Интерфейс для отображения формы для создания данных по записи в БД Security
  def insert() = Action{
    Ok(views.html.insert(""))
  }

  // Интерфейс создания записи по параметрам с выдашей чистой формы
  def insertPost() = Action{request =>
    db.withConnection{conn =>
      if(!conn.createStatement().executeQuery(
                                    "select * from securities where " +
                                      s"secid='${request.body.asFormUrlEncoded.get("secid").head.toString}'").next()) {
        conn.createStatement().executeUpdate(
                                          "insert into securities " +
                                          s"values('${request.body.asFormUrlEncoded.get("secid").head.toString}', " +
                                            s"'${request.body.asFormUrlEncoded.get("regnumber").head.toString}', " +
                                            s"'${request.body.asFormUrlEncoded.get("name").head.toString}', " +
                                            s"'${request.body.asFormUrlEncoded.get("emitent_title").head.toString}')")
        Ok("Entry added successfully")
      } else
        Ok("Entry already exists")
    }
  }

  // Метод получения записи с определенным secid
  private def getSec(secid: String): Security ={
    db.withConnection{conn =>

      // Вложенный метод парсинга результата запроса
      def parse(res: ResultSet): Security =
        if(res.next())
          Security(res.getString("secid").toString,
                    res.getString("regnumber").toString,
                    res.getString("name").toString,
                    res.getString("emitent_title").toString)
        else
          Security(null, null, null, null)

      parse(conn.createStatement().executeQuery(s"select * from securities where secid='$secid'"))
    }
  }

  // Метод получения столбика secid
  private def getAllSec(): List[String] ={
    db.withConnection{conn =>

      // Вложенный метод парсинга результата запроса с помощью хвостовой рекурсии
      @tailrec
      def parse(res: ResultSet, result: List[String]): List[String] =
        if(res.next())
          parse(res, res.getString("secid")::result)
        else
          result.reverse

      parse(conn.createStatement().executeQuery("select secid from securities order by secid asc"), Nil)
    }
  }

}
