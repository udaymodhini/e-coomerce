<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%@include file="header.jsp"%>
</head>
<body>
	<%@include file="navbar.jsp"%>

	
	<h1 class="display-4 text-center text-success">User Register</h1>


	<div class="container card card-body mt-5 w-50">


		<form action="/UserServlet" method="post">

			<div class="mb-3">
				<label for="InputUserName" class="form-label">email</label> <input
					type="text" class="form-control" id="InputUserName"
					required="required" aria-describedby="email" name="email">
			</div>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">password
					address</label> <input type="password" class="form-control"
					id="exampleInputEmail1" name="password" required="required">

			</div>
			

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>


	</div>


	<%@include file="footer.jsp"%>
</body>
</html>