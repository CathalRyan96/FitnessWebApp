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
public class HurlingController {
	public List<Hurling>getHurling(){
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbfitness","root","");
		}catch(ClassNotFoundException ex) {
			System.out.println("Error: "+ ex);
		}catch(SQLException ex) {	
			System.out.println("Error: "+ ex);
			
		}
		
		List<Hurling> hurlingEx = new ArrayList<Hurling>();
		try {
			PreparedStatement st = con.prepareStatement("select * from hurling");
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Hurling h = new Hurling();
				h.setHurlingId(rs.getInt("hurling_id"));
				h.setHurlingEx(rs.getString("hurling_ex"));
				
				hurlingEx.add(h);
			}
			rs.close();
			st.close();
			con.close();
		}catch(SQLException ex) {
			System.out.println("Error: "+ ex);
		}
		
		return hurlingEx;
		
	}
	
}
