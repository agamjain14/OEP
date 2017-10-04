<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online exam portal</title>

		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  
		<link href="/WEB-INF/resources/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
  
		<link href="/resources/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>


</head>
<body>
<body>
  
		
			
				
		<div class="navbar-fixed">
			<nav class="black" role="navigation">
    
				<div class="nav-wrapper container">
                                    
					<a target="_top"><h5 class="center-align white-text">ONLINE EXAMINATION SYSTEM</h5></a>    
				</div>
  
			</nav>
  
		</div>
		<nav>
    			<div class="nav-wrapper cyan darken-1 hoverable">
      				<ul id="nav-mobile" class="right hide-on-med-and-down">
        				<li class="active"><a href="home.jsp" class="waves-effect waves-ripple waves-light">HOME</a></li>
        				
      				</ul>
    			</div>
  		</nav>

		
				
		<div class="slider black lighten-1">
   			<ul class="slides">
     				<li>
        				<img src="/resources/picts/online-exam.ashx"> <!-- random image -->
					<div class="caption center-align ">
          					<h3>Online Exam Portal</h3>
          					<h5 class="light grey-text text-lighten-3">Your education, Our Concern</h5>
        				</div>
      				</li>
      				<li>
        				<img src="/resources/picts/image7.jpg"> <!-- random image -->
					<div class="caption left-align ">
          					<h3>Online Exam Portal</h3>
          					<h5 class="light grey-text text-lighten-3">Your education, Our Concern</h5>
        				</div>
      				</li>
      				<li>
        				<img src="/resources/picts/image2.jpg"> <!-- random image -->
					<div class="caption right-align ">
          					<h3>Online Exam Portal</h3>
          					<h5 class="light grey-text text-lighten-3">Your education, Our Concern</h5>
        				</div>
        			</li>
      				<li>
        				<img src="/resources/picts/image3.jpg"> <!-- random image -->
					<div class="caption left-align ">
          					<h3>Online Exam Portal</h3>
          					<h5 class="light grey-text text-lighten-3">Your education, Our Concern</h5>
        				</div>
        
      				</li>
				<li>
        				<img src="resources/picts/image4.jpg"> <!-- random image -->
					<div class="caption center-align ">
          					<h3>Online Exam Portal</h3>
          					<h5 class="light grey-text text-lighten-3">Your education, Our Concern</h5>
        				</div>
        
      				</li>
			
    			</ul>
  		</div>
      
				
		
			

		<div class="section no-pad-bot" id="index-banner">
    
                    <div class="container">
      
			<br><br>
      
       			<h1 class="header center green-text">Online Exam Portal</h1>
      
			<div class="row center">
        
							<h5 class="header col s12 light">Because we belive, Sharing Knowledge its not an option its an obligation.</h5>
      
						</div>
      
                        <div class="row center">
        
                            <a href="login" class="btn-large waves-effect waves-light green modal-trigger">Login</a>
                            
                            <a href="register" class="btn-large waves-effect waves-light green">Sign up!</a>
      
			</div>
      
			<br><br>
                                                

                        <!-- Modal Structure -->
                        <div id="modal1" class="modal modal-fixed-footer" style="padding:20px;width:700px">
                                                    
                            <form action="LoginServlet" method="post">
                                
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
                                                                <input id="mail" name="Email" type="email" class="validate">
                                                                <label for="mail">E-Mail</label>
                                                            </div>
                                                        </div>
            
                                                <div class="row">
                                                    <div class="input-field col s8">
                                                        <i class="material-icons prefix">verified_user</i>
                                                        <input id="pswd" name="Password" type="password" class="validate" autocomplete="off">
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
    
                        <div id="modal2" class="modal modal-fixed-footer" style="padding:20px;width:700px">
                                                    
                            <form action="AdminServlet" method="post">
                                
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
                                                                <input id="mail" name="Email" type="text">
                                                                <label for="mail">E-Mail</label>
                                                            </div>
                                                        </div>
            
                                                <div class="row">
                                                    <div class="input-field col s8">
                                                        <i class="material-icons prefix">verified_user</i>
                                                        <input id="pswd" name="Password" type="password" class="validate" autocomplete="off">
                                                        <label for="pswd">Password</label>
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
    
                    </div>
  
		</div>

                
		


		<footer class="page-footer green">
    
			<div class="container">
      
				<div class="row">
        
					<div class="col l6 s12">
          
						<h5 class="white-text">Online Exam Portal</h5>
          
						<p class="grey-text text-lighten-4">We are a team of students working on this project. Any amount would help support and continue development on this project and is greatly appreciated.</p>


        
					</div>
        
					<div class="col l3 s12">
          
						<h5 class="white-text">Made by</h5>
          
						<ul>
            
							<li><a class="white-text" href="#!">Aaron</a></li>
							
							<li><a class="white-text" href="#!">Agam</a></li>
            
							<li><a class="white-text" href="#!">Badal</a></li>
            
							<li><a class="white-text" href="#!">Chetan</a></li>
            
							<li><a class="white-text" href="#!">Jasman</a></li>
							
							<li><a class="white-text" href="#!">Prathama</a></li>
							
							<li><a class="white-text" href="#!">Sarvesh</a></li>
							
							<li><a class="white-text" href="#!">Shumbham</a></li>
							
							<li><a class="white-text" href="#!">Srikant</a></li>
							
							<li><a class="white-text" href="#!">Sunderesham</a></li>
						</ul>
        
					</div>
        
		
				</div>
    
			</div>
    
			<div class="footer-copyright">
      
				<div class="container">
      
					<a class="green-text text-lighten-3" href="index.html">Materialize</a>
      
				</div>
    
			</div>
  
		</footer>


  


		<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
      		<script>
			$(document).ready(function(){
      				$('.slider').slider({height:600});
				
    			});
		</script>
                <script>
                    $(document).ready(function(){
                    // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
                    $('.modal-trigger').leanModal();
                    });           
                </script>
   

		<script type="text/javascript" src="js/materialize.min.js"></script> 
	</body>
</body>
</html>