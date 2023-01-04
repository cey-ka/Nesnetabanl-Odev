package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Baglanti {
	static Connection conn;
	static Statement s;
	static ResultSet yap() throws SQLException {
		ResultSet myrs = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root","root");
		s = conn.createStatement();
		myrs = s.executeQuery("SELECT * FROM user");
		return myrs;
	}
	
	
	static ResultSet bul(String sql) throws SQLException {
		ResultSet myrs1 = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root","root");
		s = conn.createStatement();
		myrs1 =s.executeQuery(sql);
		return myrs1; 
		
	}

}
