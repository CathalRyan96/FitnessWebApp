package DAO;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.DriverManager;

public class LoginDAO {
private DataSource mysqlDS;
	
	DataConnect dc = new DataConnect();
	Connection conn = dc.getConnection();
	
	if(conn==null) {
		System.out.println("connection failed");
	}else {
		String query = "SELECT uname FROM users where uid = 1";

		 

	      // create the java statement

	      Statement st = conn.createStatement();

	     

	      // execute the query, and get a java resultset

	      ResultSet rs = st.executeQuery(query);

	     

	      // iterate through the java resultset

	      while (rs.next()){

	        String firstName = rs.getString("firstname");

	        out.print("\nQuery returns the firstname: \n"+firstName);

	      }
	}
		
	}
	
	
			
		
	


