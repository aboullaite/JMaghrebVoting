package controllers;



import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import play.db.DB;
import play.mvc.Controller;
import play.mvc.Result;


public class Application extends Controller {

    public static Result index() {
        return ok("ok");
    }
    
    public static Result saveVote(String idSession, String idVoter, String vote, String time) {
    	try {
    	DataSource ds= DB.getDataSource();
    	Connection conn=DB.getConnection();
    	String INSERT_SQL = "INSERT INTO votes " + "(idSession, idVoter, vote, time) "
                + " VALUES " + "('"+idSession+"', '"+URLDecoder.decode(idVoter, "UTF-8") +"', '"+vote+"', '"+URLDecoder.decode(time, "UTF-8")+"')";
    	
			Statement stat=conn.createStatement();
			stat.execute(INSERT_SQL);
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			return ok("error when inserting");
		}
    	return ok("Done");
     
    }
    
    
}
