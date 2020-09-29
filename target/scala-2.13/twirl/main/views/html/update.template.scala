
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

object update extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Security,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(sec: Security, error: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<html>
    <head>
        <title>Update database entry</title>
    </head>
    <body>
    """),_display_(/*8.6*/helper/*8.12*/.form(action = routes.CRUDController.updatePost)/*8.60*/{_display_(Seq[Any](format.raw/*8.61*/("""
        """),format.raw/*9.9*/("""<p><input type="text" name="secid" value=""""),_display_(/*9.52*/sec/*9.55*/.secid),format.raw/*9.61*/("""" readonly>Secid</input></p>
        <p><input type="text" name="regnumber" value=""""),_display_(/*10.56*/sec/*10.59*/.regnumber),format.raw/*10.69*/("""">Regnumber</input></p>
        <p><input type="text" name="name" value=""""),_display_(/*11.51*/sec/*11.54*/.name),format.raw/*11.59*/("""">Name</input></p>
        <p><input type="text" name="emitent_title" value=""""),_display_(/*12.60*/sec/*12.63*/.emitent_title),format.raw/*12.77*/("""">Emitent title</input></p>
        <input type="submit">
    """)))}),format.raw/*14.6*/("""
    """),_display_(/*15.6*/error),format.raw/*15.11*/("""
    """),format.raw/*16.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(sec:Security,error:String): play.twirl.api.HtmlFormat.Appendable = apply(sec,error)

  def f:((Security,String) => play.twirl.api.HtmlFormat.Appendable) = (sec,error) => apply(sec,error)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-09-30T02:20:01.646040
                  SOURCE: /home/chameleon/Project/Scala/Test_task_from_TOTSystems/app/views/update.scala.html
                  HASH: a3aa30fda66d6b9237af78c99d3581522638c022
                  MATRIX: 432->1|761->17|885->48|1001->139|1015->145|1071->193|1109->194|1144->203|1213->246|1224->249|1250->255|1361->339|1373->342|1404->352|1505->426|1517->429|1543->434|1648->512|1660->515|1695->529|1788->592|1820->598|1846->603|1878->608
                  LINES: 17->1|22->2|27->3|32->8|32->8|32->8|32->8|33->9|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|38->14|39->15|39->15|40->16
                  -- GENERATED --
              */
          