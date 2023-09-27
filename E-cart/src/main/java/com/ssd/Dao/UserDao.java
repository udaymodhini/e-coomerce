package com.ssd.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ssd.dto.Userdto;

import utility.DbConnection;

public class UserDao {
	
	private Connection conn=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	
	private String query="insert into user(name,email,pwd) values (?,?,?)";
	
	public  void  createUser(Userdto dto) {
		
		conn=DbConnection.getDbConnection();
		try {
			ps=conn.prepareStatement(query);
			
			ps.setString(1, dto.getName());
		    ps.setString(2, dto.getEmail());
		    ps.setString(3, dto.getPwd());
			 int noof=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
