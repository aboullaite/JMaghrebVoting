package controllers;



import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.Statement;

import play.data.*;

import javax.sql.DataSource;

import models.DatabaseConnection;
import views.html.*;
import play.db.DB;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {
   public static DatabaseConnection db=new DatabaseConnection();
   
   
   
    public static Result index() {
    	String login=session("email");
    	if(login == null) return redirect(
	            routes.Application.login()
	        );
    	else return ok(index.render("[100,30,20]"));
    }
   
   
    public static Result login() {
        return ok(login.render(Form.form(Login.class)));
    }
    public static Result logout() {
    	session().remove("email");
    	return redirect(
	            routes.Application.login()
	        );
    }
    
    public static Result authenticate() {
    	   Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
    	    if (loginForm.hasErrors()) {
    	        return badRequest(login.render(loginForm));
    	    } else {
    	        session().clear();
    	        session("email", loginForm.get().email);
    	        return redirect(
    	            routes.Application.index()
    	        );
    	    }
    }
    public static Result saveVote(String idSession, String idVoter, String vote, String time) {
    	db.connect();
    	db.addVote(idSession, idVoter, vote, time);
    	db.close();
    	return ok("Done");
     
    }
    
  //login class
    public static class Login {

        public String email;
        public String password;
        public String validate() {
        	db.connect();
        	boolean login= db.authenticate(email, password);
        	db.close();
            if (login) {
            	return null;
            }
            return "Invalid email or password";
        }
    }

    
}
