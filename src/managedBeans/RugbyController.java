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
	public class RugbyController {
		public List<Rugby>getRugby(){
			Connection con = null;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbfitness","root","");
			}catch(ClassNotFoundException ex) {
				System.out.println("Error: "+ ex);
			}catch(SQLException ex) {	
				System.out.println("Error: "+ ex);
				
			}
			
			List<Rugby> rugbyEx = new ArrayList<Rugby>();
			try {
				PreparedStatement st = con.prepareStatement("select * from rugby");
				ResultSet rs = st.executeQuery();
				while(rs.next()) {
					Rugby r = new Rugby();
					r.setRugbyId(rs.getInt("rugby_id"));
					r.setRugbyEx(rs.getString("rugby_ex"));
					
					rugbyEx.add(r);
				}
				rs.close();
				st.close();
				con.close();
			}catch(SQLException ex) {
				System.out.println("Error: "+ ex);
			}
			
			return rugbyEx;
			
		}
		

}
