package controllers

import java.sql.ResultSet
import javax.inject.Inject

import scala.annotation.tailrec
import play.api.db.Database
import play.api.mvc.{BaseController, ControllerComponents}

import model._

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
    Ok(views.html.list(getList("desc", "secid")))
  }

  // Интерфейс для отображения списка данных с применением параметров сортировки
  def listPost() = Action{request =>
    Ok(views.html.list(getList(request.body.asFormUrlEncoded.get("sort_type").head.toString(),
                                request.body.asFormUrlEncoded.get("column").head.toString())))
  }

  // Метод получения записей из БД по параметрам
  private def getList(sortType: String, sortColumn: String): List[(History, Security)] ={
    db.withConnection{conn =>

      // Вложенный метод парсинга результата запроса с помощью хвостовой рекурсии
      @tailrec
      def parse(result: List[(History, Security)], res: ResultSet):List[(History, Security)] =
        if(res.next())
          parse(
            (History(res.getString("secid"),
                      res.getString("tradedate"),
                      res.getDouble("numtrade"),
                      res.getDouble("open"),
                      res.getDouble("close")),
            Security(res.getString("secid"),
                      res.getString("regnumber"),
                      res.getString("name"),
                      res.getString("emitent_title")
            )) :: result, res)
        else
          result

      parse(Nil, conn.createStatement().executeQuery(
        "select history.secid, regnumber, name, emitent_title, tradedate, numtrade, open, close " +
        "from history " +
        "inner join securities on (securities.secid=history.secid) " +
        s"order by $sortColumn $sortType"))

    }
  }


}
