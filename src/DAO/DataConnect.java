package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataConnect {
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	//Method used to connect to SQL Database
	public DataConnect() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbfitness","root","");
			
			st = con.createStatement();
			
		}catch(Exception ex) {
			System.out.println("Error: "+ ex);
		}
	}
	
	//Method for pulling data from the database
	public void getData() {
		try {
			String query = "select * from users";
			rs = st.executeQuery(query);			
			System.out.println("Info from database");
			
			while(rs.next()) {
				int uid = rs.getInt("uid");
				System.out.println("Uid: "+ uid);

				
				String uname = rs.getString("uname");
				System.out.println("Uname: "+ uname);
				
			}
			
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
