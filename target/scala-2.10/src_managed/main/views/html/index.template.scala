
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Jmaghreb Voting System")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""

      <div class="jumbotron">
      <div class="row">
    <div class="col-md-10 col-md-offset-2">
        <h1>Jmaghreb Voting System</h1>
        <p> This is just a simple application shown Jmaghreb voting System prototype ... </p>
        
            </div>
            <div class="col-md-10 col-md-offset-5">
            <h4> <a href="""),_display_(Seq[Any](/*13.27*/routes/*13.33*/.Application.logout())),format.raw/*13.54*/("""> Log out </a></h4>
            </div>
</div>
        </div>
 <div class="row">
    <div class="col-md-10 col-md-offset-2">
    <div class="col-xs-12 .col-md-8">
  
    <label>Please choos a session ID...</label>
    </div>
    <div class="col-xs-6">
     
     <select class="form-control" name="sessionId" >
      <optgroup label="Sessions ID">
     <option value="1">Mustard</option>
      <option value="2">Ketchup</option>
      <option value="3">Relish</option>
      </optgroup>
  </select>
     </div>
     <div class="col-xs-6">
  <button type="submit" class="btn btn-default">Submit</button>
 
    </div>
    
     </div>
      <br>
     <canvas class="col-md-2 col-md-offset-2" id="chart" width="600" height="400"></canvas>
      <br>
</div></div></div>
      <div class="footer">
      <div class="row">
    <div class="col-md-2 col-md-offset-5">
     <br>
        <p>&copy; Jmaghreb 2014</p>
        </div>
</div>
      </div>

    </div> <!-- /container -->
  <!--Load the AJAX API-->
   
 <script>

 
		
var data = """),format.raw/*59.12*/("""{"""),format.raw/*59.13*/("""
			labels : ["Excellent","Good","Not bad"],
			datasets : [
				"""),format.raw/*62.5*/("""{"""),format.raw/*62.6*/("""
					fillColor : "rgba(220,220,220,0.5)",
					strokeColor : "rgba(220,220,220,1)",
					data : """),_display_(Seq[Any](/*65.14*/message)),format.raw/*65.21*/("""
				"""),format.raw/*66.5*/("""}"""),format.raw/*66.6*/("""
			]
			
		"""),format.raw/*69.3*/("""}"""),format.raw/*69.4*/(""";
	var myLine = new Chart(document.getElementById("chart").getContext("2d")).Bar(data);
	
	</script>
""")))})),format.raw/*73.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 27 21:32:02 WEST 2014
                    SOURCE: C:/Users/mohammed/WorkspacePlay/JmaghrebVoting/app/views/index.scala.html
                    HASH: a0340fd357bdeb5724dd2c1d7275f1ed5c2373e8
                    MATRIX: 774->1|885->18|922->21|960->51|999->53|1375->393|1390->399|1433->420|2491->1450|2520->1451|2612->1516|2640->1517|2774->1615|2803->1622|2835->1627|2863->1628|2902->1640|2930->1641|3063->1743
                    LINES: 26->1|29->1|31->3|31->3|31->3|41->13|41->13|41->13|87->59|87->59|90->62|90->62|93->65|93->65|94->66|94->66|97->69|97->69|101->73
                    -- GENERATED --
                */
            