package com.ssd.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.UserService;
import com.ssd.dto.Userdto;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	UserService userservice=new UserService();
    String email=request.getParameter("email");
    String name=request.getParameter("name");
    String pwd=request.getParameter("pwd");
    
	String errorMsg="Please Eneter Valied";
	boolean isValied = false;
	
	
	if(name==null || name.isEmpty() ){
		errorMsg="please enter valid";
		isValied=true;
	
	}
   if(email==null || email.isEmpty() ) {
	   errorMsg="please enter valid";
	   isValied=true;
		
   }
   if(pwd==null || pwd.isEmpty()) {
	   errorMsg="please enter valid";
	   isValied=true;
   }

   if(!isValied) {
	   Userdto dto=new Userdto();
	   dto.setName(request.getParameter("name"));
	   dto.setEmail(request.getParameter("email"));
	   dto.setPwd(request.getParameter("pwd"));
	   userservice.createUser(dto);
	   request.getRequestDispatcher("login.jsp").forward(request, response);}
   else {
	   request.setAttribute("errormsg", errorMsg);
	   request.setAttribute("isvalied", isValied);
	   request.getRequestDispatcher("signup.jsp").forward(request, response);
	
   }
  
	
	}

}
