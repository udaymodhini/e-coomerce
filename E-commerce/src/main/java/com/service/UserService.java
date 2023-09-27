package com.service;

import com.dao.UserDao;
import com.dto.UserDto;

public class UserService {
	UserDao dao=new UserDao();
	
	public void createUser(UserDto dto) {
     dao.createUser(dto);
     	
	}
	public UserDto getUser(UserDto dto) {
		return dao.loginUser(dto);
		
	}

}
