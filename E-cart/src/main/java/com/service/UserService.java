package com.service;

import com.ssd.Dao.UserDao;
import com.ssd.dto.Userdto;

public class UserService {
	
	UserDao dao=new UserDao();
	public void createUser(Userdto dto) {
		dao.createUser(dto);
	}
	

}
