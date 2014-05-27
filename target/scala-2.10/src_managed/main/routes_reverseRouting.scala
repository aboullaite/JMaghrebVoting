// @SOURCE:C:/Users/mohammed/WorkspacePlay/JmaghrebVoting/conf/routes
// @HASH:74665703bd70c2608af40ba7d3577b88e40649f8
// @DATE:Tue May 27 21:22:17 WEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:16
class ReverseAssets {
    

// @LINE:16
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:13
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:13
def saveVote(idSession:String, idVoter:String, vote:String, time:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "idSession/" + implicitly[PathBindable[String]].unbind("idSession", dynamicString(idSession)) + "/idVoter/" + implicitly[PathBindable[String]].unbind("idVoter", dynamicString(idVoter)) + "/vote/" + implicitly[PathBindable[String]].unbind("vote", dynamicString(vote)) + "/time/" + implicitly[PathBindable[String]].unbind("time", dynamicString(time)))
}
                                                

// @LINE:7
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:8
def authenticate(): Call = {
   Call("POST", _prefix)
}
                                                

// @LINE:10
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:6
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:16
class ReverseAssets {
    

// @LINE:16
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:13
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:13
def saveVote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.saveVote",
   """
      function(idSession,idVoter,vote,time) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "idSession/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("idSession", encodeURIComponent(idSession)) + "/idVoter/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("idVoter", encodeURIComponent(idVoter)) + "/vote/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("vote", encodeURIComponent(vote)) + "/time/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("time", encodeURIComponent(time))})
      }
   """
)
                        

// @LINE:7
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:8
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:10
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:6
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:16
// @LINE:13
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:16
class ReverseAssets {
    

// @LINE:16
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:13
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:13
def saveVote(idSession:String, idVoter:String, vote:String, time:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.saveVote(idSession, idVoter, vote, time), HandlerDef(this, "controllers.Application", "saveVote", Seq(classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """ Insert votes""", _prefix + """idSession/$idSession<[^/]+>/idVoter/$idVoter<[^/]+>/vote/$vote<[^/]+>/time/$time<[^/]+>""")
)
                      

// @LINE:7
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:8
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """""")
)
                      

// @LINE:10
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """Home page                                   """, _prefix + """""")
)
                      

// @LINE:6
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """ Login page""", _prefix + """login""")
)
                      
    
}
                          
}
        
    