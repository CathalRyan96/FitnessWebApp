package DAO;

import java.sql.Connection;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import DAO.DataConnect;
import managedBeans.Login;

public class LoginDAO {
	DataConnect dc = new DataConnect();

    Connection conn = dc.getConnection();

    if(conn == null){

      out.println("connection failed!"); 

    }else{   

      String query = "SELECT firstname FROM users where user_id = 0000000035";

 

      // create the java statement

      Statement st = conn.createStatement();

     

      // execute the query, and get a java resultset

      ResultSet rs = st.executeQuery(query);

     

      // iterate through the java resultset

      while (rs.next()){

        String firstName = rs.getString("firstname");

        out.print("\nQuery returns the firstname: \n"+firstName);

      }

     

      st.close();   

    }
}
}




	
	
			
		
	


