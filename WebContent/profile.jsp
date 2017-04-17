<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="package1.*, java.sql.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="icon" type="image/png" href="assets/img/favicon.ico">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<%  
	 if(session.getAttribute("uID") == null){
		 response.sendRedirect("login.jsp");
	 }
	 int uID = Integer.parseInt(session.getAttribute("uID"));	 
	%>

	<title>DevHunt Login</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />

	<!--     Fonts and icons     -->
	<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />
    <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" />

	<!-- CSS Files -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
    <link href="assets/css/material-kit.css" rel="stylesheet"/>
    <link href="assets/css/main.css" rel="stylesheet"/>

    <script src="assets/js/jquery.min.js" type="text/javascript"></script>
	<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="assets/js/material.min.js"></script>

	<!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
	<script src="assets/js/nouislider.min.js" type="text/javascript"></script>

	<!--  Plugin for the Datepicker, full documentation here: http://www.eyecon.ro/bootstrap-datepicker/ -->
	<script src="assets/js/bootstrap-datepicker.js" type="text/javascript"></script>

	<!-- Control Center for Material Kit: activating the ripples, parallax effects, scripts from the example pages etc -->
	<script src="assets/js/material-kit.js" type="text/javascript"></script>

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
  background: linear-gradient(to right, #B06AB3, #4568DC); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */"></div>

		<div class="main main-raised">
			<div class="profile-content">
	            <div class="container">
	                <div class="row">
	                    <div class="profile">
	                        <div class="avatar">
	                            <img src="assets/img/avatar.jpg" alt="Circle Image" class="img-circle img-responsive img-raised">
	                        </div>
	                        <div class="name">
	                            <h3 class="title">Ayush Singh</h3>
								<h6>Designer</h6>
	                        </div>
	                    </div>
	                </div>
	                <div class="description text-center">
                        <p>A designer and a web-developer. I've been developing websites for about a year now, and have a fair amount of experience regarding the existing web technologies. I am familiar and up to date with the current design standards and frameworks.</p>
                    </div>

					<div class="row">
						<div class="col-md-6 col-md-offset-3">
							<div class="profile-tabs">
			                    <div class="nav-align-center">
									<ul class="nav nav-pills" role="tablist">
										<li class="active">
											<a href="#about" role="tab" data-toggle="tab">
												<i class="material-icons">account_circle</i>
												About
											</a>
										</li>
										<li>
				                            <a href="#skills" role="tab" data-toggle="tab">
												<i class="material-icons">code</i>
												Skills
				                            </a>
				                        </li>
				                        <li>
				                            <a href="#workex" role="tab" data-toggle="tab">
												<i class="material-icons">business</i>
				                                Work Experience
				                            </a>
				                        </li>
				                    </ul>

				                    <div class="tab-content gallery">
										<div class="tab-pane active" id="about">
				                            <div class="row">
												<div class="col-md-6 details">
												<br>
												 <p id="gender"><strong>Gender: </strong>Male</p>
												 <p id="age"><strong>Age:	</strong>20</p>
												 <p id="dob"><strong>Dob: 	</strong>29/01/1998</p>
												 <p id="nationality"><strong>Nationality: </strong>Indian</p>
												 <p id="email"><strong>E-mail: </strong>frost.ayush@gmail.com</p>
												 <p id="phone"><strong>Phone: </strong>7073205022</p>
												</div>

												<div class="col-md-6 education">
												<br>
												 <p id="board"><strong>Board: </strong>CBSE</p>
												 <p id="12per"><strong>12th Percentage:	</strong>92%</p>
												 <p id="10per"><strong>10th Percentage 	</strong>95%</p>
												 <p id="yearop"><strong>Year of Passing: </strong>2015</p>
												 <p id="college"><strong>College: </strong>LNMIIT</p>
												 <p id="cgpa"><strong>CGPA: </strong>7.45</p>
												</div>
				                            </div>
				                        </div>
				                        <div class="tab-pane text-center" id="skills">
											<div class="row">
												<div class="col-md-3 skills">
													<br>
													<h4 style="text-align: center;"><strong>Skills:</strong></h4>
													<ul>
							                       	<li>HTML5</span></li><br><br>
							                        <li>CSS3</li>
							                        </ul>
												</div>
												<div class="col-md-3 skills">
													<br>
													<h4 style="text-align: center;"><strong>Efficiency:</strong></h4>
													<ul>
							                       	<li>70%</li><br><br>
							                        <li>60%</li>
							                        </ul>
												</div>
												<div class="col-md-3 skills">
													<br>
													<h4 style="text-align: center;"><strong>Experience:</strong></h4>
													<ul>
							                       	<li>Years: 2</li><br><br>
							                        <li>Projects: 5</li>
							                        </ul>
												</div>
												<div class="col-md-3 skills">
													<br>
													<h4 style="text-align: center;"><strong>Certifications:</strong></h4>
													<ul>
							                       	<li>HTML5<ul>
							                       	<li>Organization: Coursera</li>
							                        <li>Issuedon: 29/9/2049</li>
							                        </ul>
							                        <li>CSS3
							                        <ul>
							                       	<li>Organization: Coursera</li>
							                        <li>Issuedon: 29/9/2049</li>
							                        </ul></li>
							                        </ul>
												</div>

											</div>
				                        </div>
										<div class="tab-pane text-center" id="workex">
											<div class="row">
												<div class="col-md-4">
												<h4><strong>Internships:</strong></h4>
												<ol id="internships">
							                       	<li>One<ul style="text-align: left;">
							                       	<li id="company">Company</li>
							                       	<li id="start">Started</li>
							                       	<li id="enddate">Ended</li>
							                       	<li id="stipend">Stipend</li>
							                       	</ul>
							                       	</li>
							                       	<li>Two</li>
							                       	
							                    </ol>
												</div>
												<div class="col-md-4">
												<h4><strong>Research:</strong></h4>	
												<ol id="research">
							                       	<li>One<ul style="text-align: left;">
							                       	<li id="rtopic">Topic</li>
							                       	<li id="rfield">Field</li>
							                       	<li id="rpublishdate">Published</li>
							                       	<li id="rpublishedin">PublishedIn</li>
							                       	<li id="rsupervisedby">SupervisedBy</li>
							                       	</ul></li>
							                       	<li></li>
							                       
							                    </ol>
												</div>
												<div class="col-md-4">
												<h4><strong>Projects:</strong></h4>
												<ol id="projects">
							                       	<li>One<ul style="text-align: left;">
							                       	<li id="ptopic">Topic</li>
							                       	<li id="pfield">Field</li>
							                       	<li id="pstartdate">Started</li>
							                       	<li id="penddate">Ended</li>
							                       	<li id="psupervisedby">SupervisedBy</li>
							                       	</ul></li>
							                       	<li></li>
							                       	
							                    </ol>	
												</div>
											</div>
				                        </div>

				                    </div>
								</div>
							</div>
							<!-- End Profile Tabs -->
						</div>
	                </div>

	            </div>
	        </div>
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
</html>