<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/upload.css">





</head>
<body>

welcome ${user.username}<br><br>
<form method="post" name="myForm" action="/Demo/coursesuccess">

  
    <label for="c_name">Course Name</label>
    <input type="text" id="c_name" name="courseName" placeholder="Name.."/>
	<br/>
	<label for="c_des">Course Description</label>
    <input type="text" id="c_des" name="courseDescription" placeholder="Description.."/>
	<br/>
	<label for="c_ques">Course No_of_Questions</label>
    <input type="text" id="c_ques" name="courseNoQuestions" placeholder="Enter number.."/>
	<br/>
	<label for="c_passingscore">Course Passing_course</label>
    <input type="text" id="c_passingscore" name="coursePassingScore" placeholder="score.."/>
	<br/>
	<br/>
    
   
    

    <input type="submit" value="Submit">

  </form>


</body>
</html>