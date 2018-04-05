package managedBeans;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.mysql.jdbc.CommunicationsException;
import java.sql.Connection;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;



@ManagedBean
@SessionScoped
public class FootballController {
	public List<Football>getFootball(){
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbfitness","root","");
		}catch(ClassNotFoundException ex) {
			System.out.println("Error: "+ ex);
		}catch(SQLException ex) {	
			System.out.println("Error: "+ ex);
			
		}
		
		List<Football> footballEx = new ArrayList<Football>();
		try {
			PreparedStatement st = con.prepareStatement("select * from football");
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Football f = new Football();
				f.setFootballId(rs.getInt("football_id"));
				f.setFootballEx(rs.getString("football_ex"));
				
				footballEx.add(f);
			}
			rs.close();
			st.close();
			con.close();
		}catch(SQLException ex) {
			System.out.println("Error: "+ ex);
		}
		
		return footballEx;
		
	}
	
}
