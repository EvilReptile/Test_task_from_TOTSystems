
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


Seq[Any](format.raw/*3.1*/("""<html>
    <head>
        <title>List history</title>
    </head>
    <body>
        """),_display_(/*8.10*/helper/*8.16*/.form(action = routes.MainController.listPost)/*8.62*/{_display_(Seq[Any](format.raw/*8.63*/("""
            """),format.raw/*9.13*/("""<p>
                <input type="radio" name="sort_type" value="ascending">По возрастанию</input>
                <input type="radio" name="sort_type" value="descending">По убыванию</input>
                <select name="column">
                    <option disabled selected>Выберите нужный вам столбец</option>
                    <option value="secid">secid</option>
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
        """)))}),format.raw/*27.10*/("""
        """),format.raw/*28.9*/("""<table border="1">
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
            """),_display_(/*39.14*/for(element <- history) yield /*39.37*/{_display_(Seq[Any](format.raw/*39.38*/("""
                """),format.raw/*40.17*/("""<tr>
                    <td>"""),_display_(/*41.26*/element/*41.33*/._2.secid),format.raw/*41.42*/("""</td>
                    <td>"""),_display_(/*42.26*/element/*42.33*/._2.regnumber),format.raw/*42.46*/("""</td>
                    <td>"""),_display_(/*43.26*/element/*43.33*/._2.name),format.raw/*43.41*/("""</td>
                    <td>"""),_display_(/*44.26*/element/*44.33*/._2.emitent_title),format.raw/*44.50*/("""</td>
                    <td>"""),_display_(/*45.26*/element/*45.33*/._1.tradedate),format.raw/*45.46*/("""</td>
                    <td>"""),_display_(/*46.26*/element/*46.33*/._1.numtrade),format.raw/*46.45*/("""</td>
                    <td>"""),_display_(/*47.26*/element/*47.33*/._1.open),format.raw/*47.41*/("""</td>
                    <td>"""),_display_(/*48.26*/element/*48.33*/._1.close),format.raw/*48.42*/("""</td>
                </tr>
            """)))}),format.raw/*50.14*/("""
        """),format.raw/*51.9*/("""</table>
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
                  DATE: 2020-09-29T13:56:43.568381
                  SOURCE: /home/chameleon/Project/Scala/test_task_from_totsystems/app/views/list.scala.html
                  HASH: 1791a3fb7fb24fd067f98a74c823d665c8cba644
                  MATRIX: 432->1|781->17|911->54|1023->140|1037->146|1091->192|1129->193|1169->206|2125->1131|2161->1140|2520->1472|2559->1495|2598->1496|2643->1513|2700->1543|2716->1550|2746->1559|2804->1590|2820->1597|2854->1610|2912->1641|2928->1648|2957->1656|3015->1687|3031->1694|3069->1711|3127->1742|3143->1749|3177->1762|3235->1793|3251->1800|3284->1812|3342->1843|3358->1850|3387->1858|3445->1889|3461->1896|3491->1905|3563->1946|3599->1955
                  LINES: 17->1|22->2|27->3|32->8|32->8|32->8|32->8|33->9|51->27|52->28|63->39|63->39|63->39|64->40|65->41|65->41|65->41|66->42|66->42|66->42|67->43|67->43|67->43|68->44|68->44|68->44|69->45|69->45|69->45|70->46|70->46|70->46|71->47|71->47|71->47|72->48|72->48|72->48|74->50|75->51
                  -- GENERATED --
              */
          