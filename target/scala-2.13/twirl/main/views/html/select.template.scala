
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

object select extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[String],Security,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(secList: List[String], security: Security):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<html>
    <head>
        <title>Select database entry</title>
    </head>
    <body>
        """),_display_(/*8.10*/helper/*8.16*/.form(action = routes.CRUDController.selectPost)/*8.64*/{_display_(Seq[Any](format.raw/*8.65*/("""
            """),format.raw/*9.13*/("""<select name="security">
                <option disabled selected>Выберите нужный вам secid</option>
                """),_display_(/*11.18*/for(sec <- secList) yield /*11.37*/{_display_(Seq[Any](format.raw/*11.38*/("""
                    """),format.raw/*12.21*/("""<option value=""""),_display_(/*12.37*/sec),format.raw/*12.40*/("""">"""),_display_(/*12.43*/sec),format.raw/*12.46*/("""</option>
                """)))}),format.raw/*13.18*/("""
            """),format.raw/*14.13*/("""</select>
            <input type="submit">
        """)))}),format.raw/*16.10*/("""
        """),format.raw/*17.9*/("""<table border="1">
            <tr>
                <th>secid</th>
                <th>regnumber</th>
                <th>name</th>
                <th>emitent title</th>
            </tr>
            <tr>
                <td>"""),_display_(/*25.22*/security/*25.30*/.secid),format.raw/*25.36*/("""</td>
                <td>"""),_display_(/*26.22*/security/*26.30*/.regnumber),format.raw/*26.40*/("""</td>
                <td>"""),_display_(/*27.22*/security/*27.30*/.name),format.raw/*27.35*/("""</td>
                <td>"""),_display_(/*28.22*/security/*28.30*/.emitent_title),format.raw/*28.44*/("""</td>
            </tr>
        </table>
    </body>
</html>"""))
      }
    }
  }

  def render(secList:List[String],security:Security): play.twirl.api.HtmlFormat.Appendable = apply(secList,security)

  def f:((List[String],Security) => play.twirl.api.HtmlFormat.Appendable) = (secList,security) => apply(secList,security)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-09-29T00:13:57.119160
                  SOURCE: /home/chameleon/Project/Scala/test_task_from_totsystems/app/views/select.scala.html
                  HASH: e91c1bc81c843873358c296ef5e99fb2bc43e83d
                  MATRIX: 432->1|767->17|904->61|1025->156|1039->162|1095->210|1133->211|1173->224|1319->343|1354->362|1393->363|1442->384|1485->400|1509->403|1539->406|1563->409|1621->436|1662->449|1746->502|1782->511|2036->738|2053->746|2080->752|2134->779|2151->787|2182->797|2236->824|2253->832|2279->837|2333->864|2350->872|2385->886
                  LINES: 17->1|22->2|27->3|32->8|32->8|32->8|32->8|33->9|35->11|35->11|35->11|36->12|36->12|36->12|36->12|36->12|37->13|38->14|40->16|41->17|49->25|49->25|49->25|50->26|50->26|50->26|51->27|51->27|51->27|52->28|52->28|52->28
                  -- GENERATED --
              */
          