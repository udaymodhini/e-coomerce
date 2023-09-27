package com.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.UserDto;
import com.service.UserService;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		boolean isvalid=true;
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	
	UserService service=new UserService();
	if(!isvalid) {
		UserDto dto=new UserDto();
		dto.setEmail(dto.getEmail());
		dto.setPassword(dto.getPassword());
		
	
	
	service.createUser(dto);
	request.getRequestDispatcher("login.jsp").forward(request,response);}
	
	else {
		request.getRequestDispatcher("signup.jsp").forward(request,response);
	
		
	}
	}

	
	
}
