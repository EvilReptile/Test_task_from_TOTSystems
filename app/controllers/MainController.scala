package controllers

import java.io.File

import javax.inject.Inject
import model._
import play.api.mvc.{BaseController, ControllerComponents}

class MainController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  // Интерфейс для отображения списка данных
  def list() = Action{
    Ok(views.html.list(List(
      History(1, Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd"), "2020-09-28", 25.3, 2.5, 3.0),
      History(1, Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd"), "2020-09-28", 25.3, 2.5, 3.0),
      History(1, Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd"), "2020-09-28", 25.3, 2.5, 3.0),
      History(1, Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd"), "2020-09-28", 25.3, 2.5, 3.0),
    )))
  }

  def listPost() = Action{request =>
    println(request.body.asFormUrlEncoded.toString)
    Ok(views.html.list(List(
      History(1, Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd"), "2020-09-28", 25.3, 2.5, 3.0),
      History(1, Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd"), "2020-09-28", 25.3, 2.5, 3.0),
      History(1, Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd"), "2020-09-28", 25.3, 2.5, 3.0),
      History(1, Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd"), "2020-09-28", 25.3, 2.5, 3.0),
    )))
  }

  // Интерфейс для загрузки файлов с данными
  def upload() = Action{
    Ok(views.html.upload(""))
  }

  def uploadPost() = Action(parse.multipartFormData){
    request => request.body.file("file").map{file =>
      test(file.ref.toFile)
      Ok(views.html.upload("File upload"))
    }.getOrElse{
      Ok(views.html.upload("Error uploading file"))
    }
  }

  private def test(file: File): Unit ={
    for(a <- (scala.xml.XML.loadFile(file) \\ "row"))
      println(scala.xml.XML.loadString(a.toString()).attribute("secid"))
  }

}
