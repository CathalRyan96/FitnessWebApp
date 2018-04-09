package managedBeans;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.sql.Connection;

@ManagedBean
@SessionScoped
public class SoccerController {
	
	public List<Soccer>getSoccer(){
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbfitness","root","");
		}catch(ClassNotFoundException ex) {
			System.out.println("Error: "+ ex);
		}catch(SQLException ex) {	
			System.out.println("Error: "+ ex);
			
		}
		
		List<Soccer> soccerEx = new ArrayList<Soccer>();
		try {
			PreparedStatement st = con.prepareStatement("select * from soccer");
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Soccer s = new Soccer();
				s.setSoccerId(rs.getInt("soccer_id"));
				s.setSoccerEx(rs.getString("soccer_ex"));
				
				soccerEx.add(s);
			}
			rs.close();
			st.close();
			con.close();
		}catch(SQLException ex) {
			System.out.println("Error: "+ ex);
		}
		
		return soccerEx;
		
	}
	

}
