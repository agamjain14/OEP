<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%> --%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>you are Admin!!!!</h1>


Welcome ${user.username}
<br>
<a href="entercourse">enter course details</a><br>
<a href="uploadfile">upload question bank</a><br>
<a href="deletequestion">delete Question</a><br>
<a href="#">update and manage user</a><br>
<a href="scheduletest">schedule a test</a><br>
</body>
</html>