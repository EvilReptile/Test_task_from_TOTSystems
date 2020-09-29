package controllers

import javax.inject.Inject
import model._
import play.api.mvc.{BaseController, ControllerComponents}
import play.api.db._

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
    Ok(views.html.select(Nil, Security(null, null, null, null)))
  }

  // Интерфейс для вывода записи по параметру
  def selectPost() = Action{request =>
    Ok(views.html.select(Nil, Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd")))
  }

  // Интерфейс для отображения формы для удаления данных по записи в БД Security
  def delete() = Action{
    Ok(views.html.delete(Nil))
  }

  // Интерфейс для удаления записи по параметру
  def deletePost() = Action{request =>
    Ok("Deletion completed successfully")
  }

  // Интерфейс для отображения формы для обновления данных по записи в БД Security
  def update() = Action{
    Ok(views.html.update(Security("ABCD", "12345", "Abcd Bcd Cd D", "abcd"), ""))
  }

  // Интерфейс для обновления данных записи по параметру
  def updatePost() = Action{request =>
    Ok(request.body.asFormUrlEncoded.toString())
  }

  // Интерфейс для отображения формы для создания данных по записи в БД Security
  def insert() = Action{
    Ok(views.html.insert(""))
  }

  // Интерфейс создания записи по параметрам с выдашей чистой формы
  def insertPost() = Action{request =>
    Ok(request.body.asFormUrlEncoded.toString)
  }

}
