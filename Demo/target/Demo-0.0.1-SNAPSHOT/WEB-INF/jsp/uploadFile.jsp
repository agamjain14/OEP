<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload question</title>

<script>
function myFunction() {
	var y=document.getElementById("test").value;
	var res = y.substring(12);
    var x = "C:/Users/Administrator/Desktop/"+res;
	if(x.endsWith(".xls")||x.endsWith(".xlsx"))
	{
	document.write(x);
	}
	else 
	{
	document.write("invalid file")
	}
}
</script>


</head>
<body>

welcome ${user.username}<br><br>
 <form method="GET" action="uploadquestion" enctype="multipart/form-data">
 
 				Select a Course for which question bank is to be uploaded:
 			
                <br/><br/>
         <c:if test="${not empty lists}">

		<select name="course_name">
			 <option value="selected" >select course</option>
			<c:forEach var="listValue" items="${lists}">
    				<option>${listValue.courseName}</option>
    				
			</c:forEach> 
			
		</select>
		
	</c:if>
            
				<br><br>
                Select file to upload:
                <input type="file" id="test" name="uploadFile" />
                <br/><br/>

				<div>
				<button onclick="myFunction()" value="Upload" id="upload">UPLOAD</button>
				</div>
				
		</form>
</body>
</html>