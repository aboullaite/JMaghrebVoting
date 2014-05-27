// @SOURCE:C:/Users/mohammed/WorkspacePlay/JmaghrebVoting/conf/routes
// @HASH:0f0806ed26eb793ebd3cc4c33fddb9937258bda4
// @DATE:Tue May 27 16:39:30 WEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def saveVote(idSession:String, idVoter:String, vote:String, time:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "idSession/" + implicitly[PathBindable[String]].unbind("idSession", dynamicString(idSession)) + "/idVoter/" + implicitly[PathBindable[String]].unbind("idVoter", dynamicString(idVoter)) + "/vote/" + implicitly[PathBindable[String]].unbind("vote", dynamicString(vote)) + "/time/" + implicitly[PathBindable[String]].unbind("time", dynamicString(time)))
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def saveVote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.saveVote",
   """
      function(idSession,idVoter,vote,time) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "idSession/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("idSession", encodeURIComponent(idSession)) + "/idVoter/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("idVoter", encodeURIComponent(idVoter)) + "/vote/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("vote", encodeURIComponent(vote)) + "/time/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("time", encodeURIComponent(time))})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:12
class ReverseAssets {
    

// @LINE:12
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def saveVote(idSession:String, idVoter:String, vote:String, time:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.saveVote(idSession, idVoter, vote, time), HandlerDef(this, "controllers.Application", "saveVote", Seq(classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """ Insert votes""", _prefix + """idSession/$idSession<[^/]+>/idVoter/$idVoter<[^/]+>/vote/$vote<[^/]+>/time/$time<[^/]+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    