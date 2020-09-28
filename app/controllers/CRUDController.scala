package controllers

import javax.inject.Inject
import model._
import play.api.mvc.{BaseController, ControllerComponents}
import play.api.db._

class CRUDController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  // Интерфейс для отображения данных о ценных бумагах
  def select() = Action{
    Ok(views.html.select(Nil, Security(null, null, null, null)))
  }

  def selectPost() = Action{request =>
    Ok(views.html.select(Nil, Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd")))
  }

  // Интерфейс удаления информации о ценных бумагах
  def delete() = Action{
    Ok(views.html.delete(Nil))
  }

  def deletePost() = Action{request =>
    Ok("Deletion completed successfully")
  }

  // Интерфейс обновления информации о ценных бумагах
  def update() = Action{
    Ok(views.html.update(Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd"), ""))
  }

  def updatePost() = Action{request =>
    Ok(request.body.asFormUrlEncoded.toString())
  }

  // Интерфейс создания информациии о ценных бумагах
  def insert() = Action{
    Ok(views.html.insert(""))
  }

  def insertPost() = Action{request =>
    Ok(request.body.asFormUrlEncoded.toString)
  }

}
