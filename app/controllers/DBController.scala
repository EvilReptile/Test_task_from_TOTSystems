package controllers
import javax.inject.Inject
import model.History
import play.api.db.Database
import play.api.mvc._

class DBController @Inject()(db: Database, val controllerComponents: ControllerComponents)
  extends BaseController{

  def test() = Action{
    var outString = "Content\n"
    db.withConnection{conn =>
      /**
       * Запрос на обновление данных
       * conn.createStatement().executeUpdate("insert into test values(5, 'test_4', 'ekb');")
       */

      val res = conn.createStatement().executeQuery("select * from test")
      while (res.next()) {
        outString += (res.getInt("id") + " " + res.getString("name") + " " + res.getString("city") + "\n")
      }
    }
    Ok(outString)
  }

  // Методы реализации CRUD
  // Read
  def select(history: History): List[History] = {
    Nil
  }

  // Create
  def insert(history: History): Unit = {
  }

  // Update
  def update(history: History): Unit = {
  }

  // Delete
  def delete(history: History): Unit = {
  }

}
