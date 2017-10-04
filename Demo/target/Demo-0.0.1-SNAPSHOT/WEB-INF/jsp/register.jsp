<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<body>




<h2>Exam Signup Form</h2>
  
  <form  method="post" name="myForm" action="/Demo/registerSuccess">

		<!-- <label><b>ID</b></label>
		
		<input type="text" placeholder="Enter Your Id" name="userId" required> -->
		
		<label><b>Full Name</b></label>
		
	  	<input type="text" name="userFname" /> <br> 
	  	
	  	<label><b>User Name</b></label>
      
        <input type="text" name="username" />
            
    <br>  <label><b>Password</b></label>
     
	<input type="password" id="password"  name="userPassword" />
                                    

   
                 
	  <br><label><b>Email</b></label>
<input name="userEmail" type="email" />
                    
	  
	 <br> <label><b>Mobile Number</b></label>
 <input type="text" name="userMobileNo" /><br>
          
          
          
	 <br> <label><b>userRole</b></label>
 <input type="text" name="userRole" /><br>
 
 
 
	 <br> <label><b>userStatus</b></label>
 <input type="text" name="userStatus" /><br>             
    
<input type="submit" >Sign Up</input>
     
    
  </form>




</body>
</html>
