<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JavaWeb</title>
</head>
<body>
	<h3>Hello Welcome to my FYP1 ...</h3>
	<form action=${pageContext.request.contextPath}/hello method="get">
		<h2>Please enter your name</h2>
		Name : <input type="text" name="uname"></input> 
		<br/>
	
	        <h4>Please enter your password</h4>
		Password : <input type="text" name="upassword"></input> 
		<br/>
	
	
		<input type="submit"value="Submit" />
	</form>
</body>
</html>
