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

	<div>
		<c:if test="${isValied}">
			<h1 class="text-danger">
				<c:out value="${errorMsg}" />
			</h1>
		</c:if>
	</div>
	<h1 class="display-4 text-center text-success">User Register</h1>

			<div class="mb-3">
				<label for="InputUserName" class="form-label">name </label> <input
					type="text" class="form-control" id="InputUserName"
					required="required" aria-describedby="name" name="name">
			</div>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">email
					address</label> <input type="email" class="form-control"
					id="exampleInputEmail1" name="email" required="required">

			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Pwd
					:</label> <input type="pwd" class="form-control"
					id="exampleInputPassword1" name="pwd" required="required">
			</div>

		

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>


	</div>


	<%@include file="footer.jsp"%>
</body>
</html>