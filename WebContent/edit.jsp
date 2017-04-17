<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html lang="en">
<head>
	<meta charset="utf-8" />
	
	<link rel="icon" type="image/png" href="assets/img/favicon.ico">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>User Profile</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />

	<!--     Fonts and icons     -->
	<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />
    <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" />
	  
	<!-- CSS Files -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
    <link href="assets/css/material-kit.css" rel="stylesheet"/>
    
    <link rel="stylesheet" type="text/css" media="all" href="assets/css/editprofile.css">
</head>

<body class="profile-page header-filter">
	<nav class="navbar navbar-transparent navbar-absolute">
    	<div class="container">
        	<div class="navbar-header">
        		<a class="navbar-brand" href="#">DevHunt</a>
        	</div>

        			<ul class="nav navbar-nav navbar-right">
					<li>
		                <a href="#"  class="btn btn-simple btn-white btn-just-icon">
							<i class="fa fa-twitter"></i>
						</a>
		            </li>
		            <li>
		                <a href="#"  class="btn btn-simple btn-white btn-just-icon">
							<i class="fa fa-facebook-square"></i>
						</a>
		            </li>
					<li>
		                <a href="#"  class="btn btn-simple btn-white btn-just-icon">
							<i class="fa fa-instagram"></i>
						</a>
		            </li>
		            <li>
		            <a href="#">Logout</a>
		            </li>
        		</ul>
        	</div>
    </nav>

    <div class="wrapper">
		<div class="header" style="background: #4568DC;  /* fallback for old browsers */
		  background: -webkit-linear-gradient(to right, #B06AB3, #4568DC);  /* Chrome 10-25, Safari 5.1-6 */
		  background: linear-gradient(to right, #B06AB3, #4568DC); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
  		  height: 180px;"></div>
  		<div id="w">
    		<div id="content" class="clearfix">
      			<div id="userphoto"><img src="assets/img/avatar.jpg" alt="default avatar" width="200" height="200"></div>
      				<h1>User Profile</h1>

      				<nav id="profiletabs">
        			<ul class="clearfix">
			          <li><a href="#about" class="sel">About</a></li>
			          <li><a href="#education">Education</a></li>
			          <li><a href="#skills">Skills</a></li>
			          <li><a href="#workex">Work Experience</a></li>
			        </ul>
      				</nav>

      				<section id="about">
      				<form class="form" method="" action="">
      				<p>General Information:</p>     				
			        <p class="setting2" id="lname"><span>Name </span><input type="text" value='Ayush' class="form-control" id="username" placeholder="Username..."></p>
        	        <p class="setting2" id="lage"><span>Age </span><input type="text" value='Ayush' class="form-control" id="age" placeholder="Username..."></p>
			        <p class="setting2" id="ldob"><span>DOB </span><input type="text" value='01/29/1998' class="datepicker form-control" id="dob" placeholder="Username..."></p>
			        <p class="setting2" id="lgender"><span>Gender </span><input type="text" value='Ayush' class="form-control" id="gender" placeholder="Username..."></p>
			        <p class="setting2" id="lnationality"><span>Nationality </span><input type="text" value='Ayush' class="form-control" id="nationality" placeholder="Username..."></p>
			        <p class="setting2" id="lemail"><span>E-mail </span><input type="text" value='Ayush' class="form-control" id="email" placeholder="Username..."></p>
			        <p class="setting2" id="lphone"><span>Phone </span><input type="text" value='Ayush' class="form-control" id="phone" placeholder="Username..."></p>
			        <center><button type="submit" class="btn btn-primary btn-simple btn-lg btn-login-submit">Submit</button></center>
			        </form>
			        </section>
		
					<section id="skills" class="hidden">
					<form class="form" method="" action="">
			        <p>Add new skill:</p>
			        <p class="setting2"><span>Skill Name</span><input type="text" value='HTML5' class="form-control" id="skname" placeholder="Skill Name"></p>
			        <center><p class="setting2"><strong>Certification</strong></p></center>
			        <p class="setting2"><span>Organization:</span><input type="text" value='Coursera' class="form-control" id="skorg" placeholder="Skill Name"></p>
			        <p class="setting2"><span>Issued On:</span><input class="datepicker form-control" type="text" value="04/18/2017" id="issuedate"/></p>
			        <center><p class="setting2"><strong>Work Experience</strong></p></center>
			        <p class="setting2"><span>Number of Years:</span><input type="text" value='2' class="form-control" id="skyears" placeholder="2"></p>
			        <p class="setting2"><span>Number of Projects:</span><input type="text" value='2' class="form-control" id="skprojects" placeholder="2"></p>
			        <center><button type="submit" class="btn btn-primary btn-simple btn-lg btn-login-submit">Submit</button></center>
			        </form>
			      	</section>
      
			      <section id="workex" class="hidden">
			      	<p>Add work experience:</p>
			        <form class="form" method="" action="">
			        <p class="setting2"><strong>INTERNSHIP</strong></p>
			        <p class="setting2"><span>Company:</span><input type="text" value='HTML5' class="form-control" id="company" placeholder="Company Name"></p>
			        <p class="setting2"><span>Started:</span><input class="datepicker form-control" type="text" value="04/18/2017" id="internstarted"/></p>
			        <p class="setting2"><span>Ended:</span><input class="datepicker form-control" type="text" value="04/18/2017" id="internended"/></p>
			        <p class="setting2"><span>Stipend:</span><input type="text" value='HTML5' class="form-control" id="stipend" placeholder="Stipend"></p>
			        <center><button type="submit" class="btn btn-primary btn-simple btn-lg btn-login-submit">Submit</button></center>
			        </form>
			        
			        <form class="form" method="" action="">
			        <p class="setting2"><strong>RESEARCH</strong></p>
			       	<p class="setting2"><span>Topic:</span><input type="text" value='HTML5' class="form-control" id="rtopic" placeholder="Company Name"></p>
			        <p class="setting2"><span>Field:</span><input class="form-control" type="text" value="WEB" id="rfield" placeholder="Field" /></p>
			        <p class="setting2"><span>Published:</span><input class="datepicker form-control" type="text" value="rdate" id="internended"/></p>
			        <p class="setting2"><span>Published In:</span><input type="text" value='HTML5' class="form-control" id="rpublishedin" placeholder="Published In"></p>
			        <p class="setting2"><span>Supervised By:</span><input type="text" value='HTML5' class="form-control" id="rsupervised" placeholder="Supervsed By"></p>
			        <center><button type="submit" class="btn btn-primary btn-simple btn-lg btn-login-submit">Submit</button></center>
			        </form>


			        <form class="form" method="" action="">
			        <p class="setting2"><strong>PROJECT</strong></p>
			        <p class="setting2"><span>Topic:</span><input type="text" value='HTML5' class="form-control" id="ptopic" placeholder="Company Name"></p>
			        <p class="setting2"><span>Field:</span><input class="form-control" type="text" value="WEB" id="pfield" placeholder="Field" /></p>
			        <p class="setting2"><span>Started:</span><input class="datepicker form-control" type="text" value="04/18/2017" id="pstarted"/></p>
			        <p class="setting2"><span>Ended:</span><input class="datepicker form-control" type="text" value="04/18/2017" id="pended"/></p>
			        <p class="setting2"><span>Supervised By:</span><input type="text" value='HTML5' class="form-control" id="psupervised" placeholder="Supervsed By"></p>
			        <center><button type="submit" class="btn btn-primary btn-simple btn-lg btn-login-submit">Submit</button></center>
			        </form>
			      </section>
      
			      <section id="education" class="hidden">
			        <form class="form" method="" action="">
      				<p>Education:</p>   				
			        <p class="setting2" id="lboard"><span>Board </span><input type="text" value='Ayush' class="form-control" id="board" placeholder="Username..."></p>
        	        <p class="setting2" id="l10per"><span>10th Percentage </span><input type="text" value='Ayush' class="form-control" id="10per" placeholder="Username..."></p>
			        <p class="setting2" id="l12per"><span>12th Percentage </span><input type="text" value='Ayush' class="form-control" id="12per" placeholder="Username..."></p>
			        <p class="setting2" id="lyearop"><span>Year of Passing </span><input type="text" value='Ayush' class="form-control" id="yearop" placeholder="Username..."></p>
			        <p class="setting2" id="lcollege"><span>College </span><input type="text" value='Ayush' class="form-control" id="college" placeholder="Username..."></p>
			        <p class="setting2" id="lcgpa"><span>CGPA </span><input type="text" value='Ayush' class="form-control" id="cgpa" placeholder="Username..."></p>
			        <center><button type="submit" class="btn btn-primary btn-simple btn-lg btn-login-submit">Submit</button></center>
			        </form>
			      </section>
		    </div><!-- @end #content -->
		  </div><!-- @end #w -->
		</div>
		</div>

		 <footer class="footer">
		        <div class="container">
		            <div class="copyright" style="text-align:center; color: #FFF;">
		                &copy; 2016 | Made by Team 40
		            </div>
		        </div>
		</footer>
	</body>
	<!-- Core JS Files -->
    <script src="assets/js/jquery.min.js" type="text/javascript"></script>
	<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="assets/js/material.min.js"></script>
	<script src="assets/js/editprofile.js"></script>

	<!--  Plugin for the Datepicker, full documentation here: http://www.eyecon.ro/bootstrap-datepicker/ -->
	<script src="assets/js/bootstrap-datepicker.js" type="text/javascript"></script>

	<!-- Control Center for Material Kit: activating the ripples, parallax effects, scripts from the example pages etc -->
	<script src="assets/js/material-kit.js" type="text/javascript"></script>
</html>