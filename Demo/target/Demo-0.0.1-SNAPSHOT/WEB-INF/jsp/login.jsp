<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <div id="modal1" class="modal modal-fixed-footer" style="padding:20px;width:700px">
                                                    
                            <form method="POST" name="myForm" action="/Demo/loginvalidator">
                                
                                <div class="modal-content">
                                    
                                    <div class="row">
                
                
                                        <div class="cols s12">
                                                
                                                <div class="green-text">
                                                    <h4>Login</h4>
                                                </div>
                                                                        
                                                    <ul><li class="divider"></li></ul>    
                                                        <div class="row">
                                                            <div class="input-field col s8">
                                                                <i class="material-icons prefix">drafts</i>
                                                                <input type="text" name="username" class="validate">
                                                                <label for="mail">Username</label>
                                                            </div>
                                                        </div>
            
                                                <div class="row">
                                                    <div class="input-field col s8">
                                                        <i class="material-icons prefix">verified_user</i>
                                                        <input type="password" id="password"  name="userPassword">
                                                        <label for="pswd">Password</label>
                                                    </div>
                                                </div>
                                                    
                                                <div class="row">
                                                    <div class="input-field col s12">
                                                        <a class="green waves-effect waves-light btn-large" href="forgot.jsp">Forgot Password
                                                            <i class="material-icons right">mood_bad</i>
                                                        </a>
                                                    </div>
                                                </div>
            
            
                                        </div>
                
                                    </div>
                                
                                </div>
                                <div class="modal-footer" style="padding-right:30px">
                                                            
                                    <button class="btn  green waves-effect waves-light" type="submit" name="action">Login
                                        <i class="material-icons right">send</i>
                                    </button>
                                                 
                                    <button class="btn green waves-effect waves-light" type="reset" name="action">Reset
                                    </button>
            
                                                                        
                                </div>
                            
                            </form>
                            
                        </div>


</body>
</html>