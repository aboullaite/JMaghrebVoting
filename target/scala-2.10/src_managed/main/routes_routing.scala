// @SOURCE:C:/Users/mohammed/WorkspacePlay/JmaghrebVoting/conf/routes
// @HASH:0f0806ed26eb793ebd3cc4c33fddb9937258bda4
// @DATE:Tue May 27 16:39:30 WEST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Application_saveVote1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("idSession/"),DynamicPart("idSession", """[^/]+""",true),StaticPart("/idVoter/"),DynamicPart("idVoter", """[^/]+""",true),StaticPart("/vote/"),DynamicPart("vote", """[^/]+""",true),StaticPart("/time/"),DynamicPart("time", """[^/]+""",true))))
        

// @LINE:12
private[this] lazy val controllers_Assets_at2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """idSession/$idSession<[^/]+>/idVoter/$idVoter<[^/]+>/vote/$vote<[^/]+>/time/$time<[^/]+>""","""controllers.Application.saveVote(idSession:String, idVoter:String, vote:String, time:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Application_saveVote1(params) => {
   call(params.fromPath[String]("idSession", None), params.fromPath[String]("idVoter", None), params.fromPath[String]("vote", None), params.fromPath[String]("time", None)) { (idSession, idVoter, vote, time) =>
        invokeHandler(controllers.Application.saveVote(idSession, idVoter, vote, time), HandlerDef(this, "controllers.Application", "saveVote", Seq(classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """ Insert votes""", Routes.prefix + """idSession/$idSession<[^/]+>/idVoter/$idVoter<[^/]+>/vote/$vote<[^/]+>/time/$time<[^/]+>"""))
   }
}
        

// @LINE:12
case controllers_Assets_at2(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     