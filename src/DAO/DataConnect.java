package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataConnect {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb", "pankaj", ");
		}
	}

}
