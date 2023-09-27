package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utility {
	
	private static  Connection conn;
	
	public static Connection getDbConnection() {
		
	try {
		Class.forName("com.mysql.jdbc.Driver");
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecart", "root", "Root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
	
	
	e.printStackTrace();
	}
	
	return conn;	
		
		
	}
	
	
	

}
