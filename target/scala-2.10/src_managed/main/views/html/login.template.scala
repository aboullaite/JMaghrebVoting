
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""
"""),_display_(Seq[Any](/*2.2*/main("Jmaghreb Voting System")/*2.32*/ {_display_(Seq[Any](format.raw/*2.34*/("""

      <div class="jumbotron">
      <div class="row">
    <div class="col-md-10 col-md-offset-2">
        <h1>Jmaghreb Voting System</h1>
        <p> This is just a simple application shown Jmaghreb voting System prototype </p>
            </div>
      </div>  
          
</div>
"""),_display_(Seq[Any](/*13.2*/helper/*13.8*/.form(routes.Application.authenticate)/*13.46*/ {_display_(Seq[Any](format.raw/*13.48*/("""
"""),_display_(Seq[Any](/*14.2*/if(form.hasGlobalErrors)/*14.26*/ {_display_(Seq[Any](format.raw/*14.28*/("""

<div class="alert alert-danger"><span class="glyphicon glyphicon-alert"></span><strong> Error!  """),_display_(Seq[Any](/*16.98*/form/*16.102*/.globalError.message)),format.raw/*16.122*/("""</strong></div>
   
""")))})),format.raw/*18.2*/("""
  
      <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
    <div class="col-sm-10">
      <input type="email" name= "email" class="form-control" id="inputEmail3" placeholder="Email" value=""""),_display_(Seq[Any](/*23.107*/form("email")/*23.120*/.value)),format.raw/*23.126*/("""">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
    <div class="col-sm-10">
      <input type="password" name="password"  class="form-control" id="inputPassword3" placeholder="Password">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      
      </div>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Sign in</button>
    </div>
  </div>
</div>
""")))})),format.raw/*44.2*/("""
      <div class="footer">
      <div class="row">
    <div class="col-md-2 col-md-offset-5">
     <br>
        <p>&copy; Jmaghreb 2014</p>
        </div>
</div>
      </div>

    </div> <!-- /container -->
 
""")))})),format.raw/*56.2*/("""
"""))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 27 21:43:12 WEST 2014
                    SOURCE: C:/Users/mohammed/WorkspacePlay/JmaghrebVoting/app/views/login.scala.html
                    HASH: c80a96652716aff86a54f95ca0002178d756ae2e
                    MATRIX: 791->1|916->32|953->35|991->65|1030->67|1359->361|1373->367|1420->405|1460->407|1498->410|1531->434|1571->436|1708->537|1722->541|1765->561|1819->584|2104->832|2127->845|2156->851|2776->1440|3030->1663
                    LINES: 26->1|29->1|30->2|30->2|30->2|41->13|41->13|41->13|41->13|42->14|42->14|42->14|44->16|44->16|44->16|46->18|51->23|51->23|51->23|72->44|84->56
                    -- GENERATED --
                */
            