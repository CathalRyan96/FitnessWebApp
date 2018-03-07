package DAO;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	
	public static boolean validate(String user, String password) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DataConnect.getConnection();
			ps = con.preparedStatement("Select uname, password from Users where uname = ? and paswod = ?");
			
		}
	}

}
