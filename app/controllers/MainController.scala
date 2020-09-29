package controllers

import java.io.File

import javax.inject.Inject
import model._
import scala.xml.XML._
import scala.xml.Elem
import play.api.db.Database
import play.api.mvc.{BaseController, ControllerComponents}

/**
 * Контроллер для отображения истории
 * На вход может получать параметры сортировики и
 * по результатам выводить новую страницу
 *
 * list является GET контроллером, который выдает
 * страницу с формой сортировки и таблицей данных
 *
 * listPost является POST контроллером, который принимает
 * параметры сортировки и выводит отсортированную таблицу
 */
class MainController @Inject()(db: Database, val controllerComponents: ControllerComponents) extends BaseController {

  // Интерфейс для отображения списка данных без параметров сортировки
  def list() = Action{
    Ok(views.html.list(List(
      (History("ABCD", "2020-09-28", "25.3", "2.5", "3.0"), Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd")),
      (History("ABCD", "2020-09-28", "25.3", "2.5", "3.0"), Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd")),
      (History("ABCD", "2020-09-28", "25.3", "2.5", "3.0"), Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd")),
      (History("ABCD", "2020-09-28", "25.3", "2.5", "3.0"), Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd")),
      (History("ABCD", "2020-09-28", "25.3", "2.5", "3.0"), Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd"))
    )))
  }

  // Интерфейс для отображения списка данных с применением параметров сортировки
  def listPost() = Action{request =>
    println(request.body.asFormUrlEncoded.toString)
    Ok(views.html.list(List(
      (History("ABCD", "2020-09-28", "25.3", "2.5", "3.0"), Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd")),
      (History("ABCD", "2020-09-28", "25.3", "2.5", "3.0"), Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd")),
      (History("ABCD", "2020-09-28", "25.3", "2.5", "3.0"), Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd")),
      (History("ABCD", "2020-09-28", "25.3", "2.5", "3.0"), Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd")),
      (History("ABCD", "2020-09-28", "25.3", "2.5", "3.0"), Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd"))
    )))
  }
}
