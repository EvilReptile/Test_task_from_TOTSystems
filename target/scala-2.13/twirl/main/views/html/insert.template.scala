
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

object insert extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(error: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<html>
    <head>
        <title>Insert database entry</title>
    </head>
    <body>
        """),_display_(/*7.10*/helper/*7.16*/.form(action = routes.CRUDController.insertPost)/*7.64*/{_display_(Seq[Any](format.raw/*7.65*/("""
            """),format.raw/*8.13*/("""<p><input type="text" name="secid">Введите secid</input></p>
            <p><input type="text" name="regnumber">Введите regnumber</input></p>
            <p><input type="text" name="name">Введите name</input></p>
            <p><input type="text" name="emitent_title">Введите emitent title</input></p>
            <input type="submit">
        """)))}),format.raw/*13.10*/("""
        """),_display_(/*14.10*/error),format.raw/*14.15*/("""
    """),format.raw/*15.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(error:String): play.twirl.api.HtmlFormat.Appendable = apply(error)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (error) => apply(error)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-09-29T00:11:28.445098
                  SOURCE: /home/chameleon/Project/Scala/test_task_from_totsystems/app/views/insert.scala.html
                  HASH: 7c09c44ce3beff99510907702b4a9d09fc2aedc7
                  MATRIX: 730->1|839->17|960->112|974->118|1030->166|1068->167|1108->180|1484->525|1521->535|1547->540|1579->545
                  LINES: 21->1|26->2|31->7|31->7|31->7|31->7|32->8|37->13|38->14|38->14|39->15
                  -- GENERATED --
              */
          