
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*9.103*/("""">
       
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*12.74*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*13.19*/routes/*13.25*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*13.67*/("""" type="text/javascript"></script>
   <script src=""""),_display_(Seq[Any](/*14.18*/routes/*14.24*/.Assets.at("javascripts/Chart.js"))),format.raw/*14.58*/("""" type="text/javascript"></script>
    </head>
    <body class="container">
        """),_display_(Seq[Any](/*17.10*/content)),format.raw/*17.17*/("""
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 26 19:15:01 WEST 2014
                    SOURCE: C:/Users/mohammed/WorkspacePlay/JmaghrebVoting/app/views/main.scala.html
                    HASH: 9848234f0a43457e1e8146fd2c76add33b5c8e53
                    MATRIX: 778->1|902->31|990->84|1016->89|1113->151|1127->157|1182->191|1273->247|1287->253|1352->296|1457->365|1472->371|1526->403|1587->428|1602->434|1669->479|1758->532|1773->538|1837->580|1925->632|1940->638|1996->672|2117->757|2146->764
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|45->17|45->17
                    -- GENERATED --
                */
            