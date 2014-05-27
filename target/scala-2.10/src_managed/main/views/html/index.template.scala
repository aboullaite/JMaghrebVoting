
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
        <p> This is just a simple application shown Jmaghreb voting System prototype </p>
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

 
		
var data = """),format.raw/*56.12*/("""{"""),format.raw/*56.13*/("""
			labels : ["Excellent","Good","Not bad"],
			datasets : [
				"""),format.raw/*59.5*/("""{"""),format.raw/*59.6*/("""
					fillColor : "rgba(220,220,220,0.5)",
					strokeColor : "rgba(220,220,220,1)",
					data : """),_display_(Seq[Any](/*62.14*/message)),format.raw/*62.21*/("""
				"""),format.raw/*63.5*/("""}"""),format.raw/*63.6*/("""
			]
			
		"""),format.raw/*66.3*/("""}"""),format.raw/*66.4*/(""";
	var myLine = new Chart(document.getElementById("chart").getContext("2d")).Bar(data);
	
	</script>
""")))})),format.raw/*70.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 27 16:44:34 WEST 2014
                    SOURCE: C:/Users/mohammed/WorkspacePlay/JmaghrebVoting/app/views/index.scala.html
                    HASH: cb8c367d463d95f7505f17615656cf4e7813c468
                    MATRIX: 774->1|885->18|922->21|960->51|999->53|2280->1306|2309->1307|2401->1372|2429->1373|2563->1471|2592->1478|2624->1483|2652->1484|2691->1496|2719->1497|2852->1599
                    LINES: 26->1|29->1|31->3|31->3|31->3|84->56|84->56|87->59|87->59|90->62|90->62|91->63|91->63|94->66|94->66|98->70
                    -- GENERATED --
                */
            