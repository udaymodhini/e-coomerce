package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dto.UserDto;


public class UserDao {
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	String query1="insert into user (email,password) values (?,?)";
	
	public void createUser(UserDto dto) {

		conn=Utility.getDbConnection();
		try {
			ps=conn.prepareStatement(query1);
		
		ps.setString(1, dto.getEmail());
		ps.setString(2, dto.getPassword());
		int noofrecords=ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public UserDto loginUser(UserDto dto) {
			UserDto userdto=null;
			try {
            conn=Utility.getDbConnection();
            ps=conn.prepareStatement(query1);
            ps.setString(1,dto.getEmail());
            ps.setString(2, dto.getPassword());
            rs=ps.executeQuery();
            while(rs.next()) {
             userdto=new UserDto();
             userdto.setEmail(rs.getString(1));
             userdto.setPassword(rs.getString(2));}
			}catch(Exception e) {
            
            }
			return userdto;
		}
	}