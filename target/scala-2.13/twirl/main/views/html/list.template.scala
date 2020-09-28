
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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[History],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(history: List[History]):play.twirl.api.HtmlFormat.Appendable = {
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
                    <td>"""),_display_(/*41.26*/element/*41.33*/.security.secid),format.raw/*41.48*/("""</td>
                    <td>"""),_display_(/*42.26*/element/*42.33*/.security.regnumber),format.raw/*42.52*/("""</td>
                    <td>"""),_display_(/*43.26*/element/*43.33*/.security.name),format.raw/*43.47*/("""</td>
                    <td>"""),_display_(/*44.26*/element/*44.33*/.security.emitent_title),format.raw/*44.56*/("""</td>
                    <td>"""),_display_(/*45.26*/element/*45.33*/.tradedate),format.raw/*45.43*/("""</td>
                    <td>"""),_display_(/*46.26*/element/*46.33*/.numtrade),format.raw/*46.42*/("""</td>
                    <td>"""),_display_(/*47.26*/element/*47.33*/.open),format.raw/*47.38*/("""</td>
                    <td>"""),_display_(/*48.26*/element/*48.33*/.close),format.raw/*48.39*/("""</td>
                </tr>
            """)))}),format.raw/*50.14*/("""
        """),format.raw/*51.9*/("""</table>
    </body>
</html>"""))
      }
    }
  }

  def render(history:List[History]): play.twirl.api.HtmlFormat.Appendable = apply(history)

  def f:((List[History]) => play.twirl.api.HtmlFormat.Appendable) = (history) => apply(history)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-09-29T00:54:02.250672
                  SOURCE: /home/chameleon/Project/Scala/test_task_from_totsystems/app/views/list.scala.html
                  HASH: 8cd6c03277cb5ee7eb8488f4ba911f115bf635cb
                  MATRIX: 432->1|757->17|875->42|987->128|1001->134|1055->180|1093->181|1133->194|2089->1119|2125->1128|2484->1460|2523->1483|2562->1484|2607->1501|2664->1531|2680->1538|2716->1553|2774->1584|2790->1591|2830->1610|2888->1641|2904->1648|2939->1662|2997->1693|3013->1700|3057->1723|3115->1754|3131->1761|3162->1771|3220->1802|3236->1809|3266->1818|3324->1849|3340->1856|3366->1861|3424->1892|3440->1899|3467->1905|3539->1946|3575->1955
                  LINES: 17->1|22->2|27->3|32->8|32->8|32->8|32->8|33->9|51->27|52->28|63->39|63->39|63->39|64->40|65->41|65->41|65->41|66->42|66->42|66->42|67->43|67->43|67->43|68->44|68->44|68->44|69->45|69->45|69->45|70->46|70->46|70->46|71->47|71->47|71->47|72->48|72->48|72->48|74->50|75->51
                  -- GENERATED --
              */
          