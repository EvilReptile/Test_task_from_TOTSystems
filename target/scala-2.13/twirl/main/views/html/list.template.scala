
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
/*1.2*/import model._

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[scala.Tuple2[History, Security]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(history: List[(History, Security)]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<html lang="ru">
    <head>
        <title>List history</title>
    </head>
    <body>
        """),_display_(/*8.10*/helper/*8.16*/.form(action = routes.MainController.listPost)/*8.62*/{_display_(Seq[Any](format.raw/*8.63*/("""
        """),format.raw/*9.9*/("""<p>
            <input type="radio" name="sort_type" value="asc">По возрастанию</input>
            <input type="radio" name="sort_type" value="desc" checked>По убыванию</input>
            <select name="column">
                <option value="secid" selected>secid</option>
                <option value="regnumber">regnumber</option>
                <option value="name">name</option>
                <option value="emitent_title">emitent title</option>
                <option value="tradedate">tradedate</option>
                <option value="numtrade">numtrade</option>
                <option value="open">open</option>
                <option value="close">close</option>
            </select>
        </p>
        <p>
            <input type="submit">
        </p>
        """)))}),format.raw/*26.10*/("""
        """),format.raw/*27.9*/("""<table border="1">
            <tr>
                <th>secid</th>
                <th>regnumber</th>
                <th>name</th>
                <th>emitent title</th>
                <th>tradedate</th>
                <th>numtrade</th>
                <th>open</th>
                <th>close</th>
            </tr>
            """),_display_(/*38.14*/for(element <- history) yield /*38.37*/{_display_(Seq[Any](format.raw/*38.38*/("""
            """),format.raw/*39.13*/("""<tr>
                <td>"""),_display_(/*40.22*/element/*40.29*/._2.secid),format.raw/*40.38*/("""</td>
                <td>"""),_display_(/*41.22*/element/*41.29*/._2.regnumber),format.raw/*41.42*/("""</td>
                <td>"""),_display_(/*42.22*/element/*42.29*/._2.name),format.raw/*42.37*/("""</td>
                <td>"""),_display_(/*43.22*/element/*43.29*/._2.emitent_title),format.raw/*43.46*/("""</td>
                <td>"""),_display_(/*44.22*/element/*44.29*/._1.tradedate),format.raw/*44.42*/("""</td>
                <td>"""),_display_(/*45.22*/element/*45.29*/._1.numtrade),format.raw/*45.41*/("""</td>
                <td>"""),_display_(/*46.22*/element/*46.29*/._1.open),format.raw/*46.37*/("""</td>
                <td>"""),_display_(/*47.22*/element/*47.29*/._1.close),format.raw/*47.38*/("""</td>
            </tr>
            """)))}),format.raw/*49.14*/("""
        """),format.raw/*50.9*/("""</table>
    </body>
</html>"""))
      }
    }
  }

  def render(history:List[scala.Tuple2[History, Security]]): play.twirl.api.HtmlFormat.Appendable = apply(history)

  def f:((List[scala.Tuple2[History, Security]]) => play.twirl.api.HtmlFormat.Appendable) = (history) => apply(history)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-09-30T02:21:27.619299
                  SOURCE: /home/chameleon/Project/Scala/Test_task_from_TOTSystems/app/views/list.scala.html
                  HASH: 403eca3dce9116ebbe7d35e8603de5d8f1eb802c
                  MATRIX: 432->1|781->17|911->54|1033->150|1047->156|1101->202|1139->203|1174->212|1988->995|2024->1004|2383->1336|2422->1359|2461->1360|2502->1373|2555->1399|2571->1406|2601->1415|2655->1442|2671->1449|2705->1462|2759->1489|2775->1496|2804->1504|2858->1531|2874->1538|2912->1555|2966->1582|2982->1589|3016->1602|3070->1629|3086->1636|3119->1648|3173->1675|3189->1682|3218->1690|3272->1717|3288->1724|3318->1733|3386->1770|3422->1779
                  LINES: 17->1|22->2|27->3|32->8|32->8|32->8|32->8|33->9|50->26|51->27|62->38|62->38|62->38|63->39|64->40|64->40|64->40|65->41|65->41|65->41|66->42|66->42|66->42|67->43|67->43|67->43|68->44|68->44|68->44|69->45|69->45|69->45|70->46|70->46|70->46|71->47|71->47|71->47|73->49|74->50
                  -- GENERATED --
              */
          