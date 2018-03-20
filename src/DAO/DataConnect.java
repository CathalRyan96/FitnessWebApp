package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnect {
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn;
			try {
				conn = DriverManager.getConnection("jdbc://mysql://localhost:3306/dbfitness","root","cathal");
				return conn;
			} catch (SQLException e) {
				
				e.printStackTrace();
				return null;
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			return null;
		}
		
		
	}

}
