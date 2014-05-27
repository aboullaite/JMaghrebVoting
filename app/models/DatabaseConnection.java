package models;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import play.data.validation.*;

import javax.sql.DataSource;

import play.db.DB;

public class DatabaseConnection {

	private Connection connection;
	private Statement statement;

	// connection method
	public void connect() {

		try {

			DataSource ds = DB.getDataSource();
			 connection = DB.getConnection();
			 statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// deconnection method

	public void close() {
		try {
			connection.close();
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	// add vote to database
	public void addVote(String idSession, String idVoter, String vote, String time){
		try {
			String INSERT_SQL = "INSERT INTO votes " + "(idSession, idVoter, vote, time) "
			        + " VALUES " + "('"+idSession+"', '"+URLDecoder.decode(idVoter, "UTF-8") +"', '"+vote+"', '"+URLDecoder.decode(time, "UTF-8")+"')";
		statement.execute(INSERT_SQL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
	}
	
	// authentication method
	public boolean authenticate(String email, String pwd){
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if(!email.matches(EMAIL_REGEX))return false;
		String SELECT_SQL="select * from users where email ='"+email+"' and MD5('"+pwd+"')=password";
		try {
			ResultSet result=statement.executeQuery(SELECT_SQL);
			if(result.next()) return true;
		} catch (SQLException e) {
			return false;
		}
		return false;
	
	}
	
}
