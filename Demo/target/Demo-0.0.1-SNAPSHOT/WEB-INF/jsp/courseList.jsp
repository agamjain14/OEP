<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Course List</h1>
welcome ${user.username}<br>
<form method="GET" action="enrollcoursesuccess" >
 
 				Select a Course for which ${user.username} want to enroll:
 			
                <br/><br/>
         <c:if test="${not empty lists}">

		<select name="courseName">
			 <option value="selected" >select course</option>
			<c:forEach var="listValue" items="${lists}">
    				<option>${listValue.courseName}</option>
    				
			</c:forEach> 
			
		</select>
		
	</c:if>
            
				
                <br/><br/>
				<p> enter your user name</p>
				<input type="text" name="username">
				<div>
				<input type="submit" value="Submit"/>
				</div>
				
		</form>

</body>
</html>