
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

object upload extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
    <head>
        <title>Upload files</title>
    </head>
    <body>
        """),_display_(/*8.10*/helper/*8.16*/.form(action = routes.UploadController.uploadPost, Symbol("enctype") -> "multipart/form-data")/*8.110*/ {_display_(Seq[Any](format.raw/*8.112*/("""
            """),format.raw/*9.13*/("""<input type="file" name="file">
            <p>
                <input type="submit">
            </p>
        """)))}),format.raw/*13.10*/("""
        """),_display_(/*14.10*/message),format.raw/*14.17*/("""
    """),format.raw/*15.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-09-30T02:20:01.657009
                  SOURCE: /home/chameleon/Project/Scala/Test_task_from_TOTSystems/app/views/upload.scala.html
                  HASH: ac897009f2211b07b499f00f6d86509564b9f07f
                  MATRIX: 730->1|841->19|868->20|980->106|994->112|1097->206|1137->208|1177->221|1320->333|1357->343|1385->350|1417->355
                  LINES: 21->1|26->2|27->3|32->8|32->8|32->8|32->8|33->9|37->13|38->14|38->14|39->15
                  -- GENERATED --
              */
          