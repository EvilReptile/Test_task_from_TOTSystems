
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

object delete extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(secList: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<html>
    <head>
        <title>Delete database entry</title>
    </head>
    <body>
        """),_display_(/*7.10*/helper/*7.16*/.form(action = routes.CRUDController.deletePost)/*7.64*/{_display_(Seq[Any](format.raw/*7.65*/("""
            """),format.raw/*8.13*/("""<select name="security">
                <option disabled>Выберите нужный вам secid</option>
                """),_display_(/*10.18*/for(sec <- secList) yield /*10.37*/{_display_(Seq[Any](format.raw/*10.38*/("""
                    """),format.raw/*11.21*/("""<option value=""""),_display_(/*11.37*/sec),format.raw/*11.40*/("""">"""),_display_(/*11.43*/sec),format.raw/*11.46*/("""</option>
                """)))}),format.raw/*12.18*/("""
            """),format.raw/*13.13*/("""</select>
            <input type="submit">
        """)))}),format.raw/*15.10*/("""
    """),format.raw/*16.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(secList:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(secList)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (secList) => apply(secList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-09-30T02:20:01.651134
                  SOURCE: /home/chameleon/Project/Scala/Test_task_from_TOTSystems/app/views/delete.scala.html
                  HASH: 199d6ed2b5db543f2e372f4ebe8a38fdb7b70aa2
                  MATRIX: 736->1|853->25|974->120|988->126|1044->174|1082->175|1122->188|1259->298|1294->317|1333->318|1382->339|1425->355|1449->358|1479->361|1503->364|1561->391|1602->404|1686->457|1718->462
                  LINES: 21->1|26->2|31->7|31->7|31->7|31->7|32->8|34->10|34->10|34->10|35->11|35->11|35->11|35->11|35->11|36->12|37->13|39->15|40->16
                  -- GENERATED --
              */
          