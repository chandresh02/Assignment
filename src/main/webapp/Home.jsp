<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Assignment Management</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta name="author" content="" />

  <!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<link href="https://fonts.googleapis.com/css?family=Rubik:300,400,500,700,900" rel="stylesheet">
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="css/bootstrap.css">

	<!-- Magnific Popup -->
	<link rel="stylesheet" href="css/magnific-popup.css">

	<!-- Flexslider  -->
	<link rel="stylesheet" href="css/flexslider.css">

	<!-- Owl Carousel -->
	<link rel="stylesheet" href="css/owl.carousel.min.css">
	<link rel="stylesheet" href="css/owl.theme.default.min.css">
	
	<!-- Flaticons  -->
	<link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">

	<!-- Theme style  -->
	<link rel="stylesheet" href="css/style.css">

	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

	</head>
	<body>
		
	<div class="colorlib-loader"></div>

	<div id="page">
		<nav class="colorlib-nav" role="navigation">
			<div class="upper-menu">
				<div class="container">
					<div class="row">
						<div class="col-xs-4">
							<ul>
							<li><img src="images/x-workz_1.jpg"/></li>
							<li><p>OMKAR DEVELOPMENT CENTER</p></li>
						</ul>
						</div>
						<div class="col-xs-8 text-right menu-1">
                        <ul>
                            <li class="active"><a href="Home.jsp">Home</a></li>
                            <li >
                                <a href="ChangePassword.jsp">change-password</a>
                                
                            </li>
                            <li >
                                <a href=ChangeSetting.jsp">change-setting</a>
                                
                            </li>
                            <li class=""><a href="CreateAssignment.jsp">create-assignment</a></li>
                            <li ><a href="AssignAssignment.jsp">assign</a></li>
                            <li ><a href="SearchAssignment.jsp">search</a></li>
                            
                            <li><a href="SignIn.jsp">SignOut</a></li>
                            
                        </ul>
                    </div>
					</div>
				</div>
			</div>
			<div class="top-menu">
				<div class="container">
					</div>
					
			</div>
		</nav>
		<aside id="colorlib-hero">
			<div class="flexslider">
				<ul class="slides">
			   	<li style="background-image: url(images/img_bg_1.jpg);">
			   		<div class="overlay"></div>
			   		<div class="container-fluid">
			   			<div class="row">
				   			<div class="col-md-8 col-sm-12 col-md-offset-2 col-xs-12 col-md-pull-1 slider-text">
				   				<div class="slider-text-inner">
				   					<div class="desc">
				   						<h2>complete assignment on time</h2>
					   					<h1>perfect way of Learning</h1>
					   					<!-- <p><a href="https://vimeo.com/channels/staffpicks/93951774" class="btn btn-primary btn-lg popup-vimeo"><span class="icon"><i class="icon-play3"></i></span> Start Learning Now!</a></p> -->
				   					</div>
				   				</div>
				   			</div>
				   		</div>
			   		</div>
			   	</li>
			   	<!-- <li style="background-image: url(images/img_bg_5.jpg);">
			   		<div class="overlay"></div>
			   		<div class="container-fluid">
			   			<div class="row">
				   			<div class="col-md-8 col-sm-12 col-md-offset-2 col-xs-12 col-md-pull-1 slider-text">
				   				<div class="slider-text-inner">
				   					<div class="desc">
				   						<h2>You only have to know one thing</h2>
					   					<h1>Online Free Course</h1>
					   					<p><a href="https://vimeo.com/channels/staffpicks/93951774" class="btn btn-primary btn-lg popup-vimeo"><span class="icon"><i class="icon-play3"></i></span> Start Learning Now!</a></p>
					   				</div>
				   				</div>
				   			</div>
				   		</div>
			   		</div>
			   	</li> -->
			   	<!-- <li style="background-image: url(images/img_bg_3.jpg);">
			   		<div class="overlay"></div>
			   		<div class="container-fluid">
			   			<div class="row">
				   			<div class="col-md-8 col-sm-12 col-md-offset-2 col-xs-12 col-md-pull-1 slider-text">
				   				<div class="slider-text-inner">
				   					<div class="desc">
				   						<h2>You only have to know one thing</h2>
					   					<h1>Education is a Key to Success</h1>
					   					<p><a href="https://vimeo.com/channels/staffpicks/93951774" class="btn btn-primary btn-lg popup-vimeo"><span class="icon"><i class="icon-play3"></i></span> Start Leaning Now!</a></p>
					   				</div>
				   				</div>
				   			</div>
				   		</div>
			   		</div>
			   	</li>
			   	<li style="background-image: url(images/img_bg_4.jpg);">
			   		<div class="overlay"></div>
			   		<div class="container-fluid">
			   			<div class="row">
				   			<div class="col-md-8 col-sm-12 col-md-offset-2 col-xs-12 col-md-pull-1 slider-text">
				   				<div class="slider-text-inner">
				   					<div class="desc">
				   						<h2>You only have to know one thing</h2>
					   					<h1>Best Online Learning Center</h1>
					   					<p><a href="https://vimeo.com/channels/staffpicks/93951774" class="btn btn-primary btn-lg popup-vimeo"><span class="icon"><i class="icon-play3"></i></span> Start Learning Now!</a></p>
					   				</div>
				   				</div>
				   			</div>
				   		</div>
			   		</div>
			   	</li>	 -->
			  	</ul>
		  	</div>
		</aside> 

	
		
		
		
		<!-- <div class="colorlib-classes">
			<div class="container-fluid">
				
				</div>
				<div class="row">
					<div class="col-md-12 animate-box">
						<div class="owl-carousel">
							<div class="item">
								<div class="classes">
									<div class="classes-img" style="background-image: url(images/classes-1.jpg);">
									</div>
									<div class="wrap">
										<div class="desc">
											<span class="teacher">David Clarson</span>
											<h3><a href="#">Developing Mobile Apps Using Ruby on Rails</a></h3>
										</div>
										<div class="pricing">
											<p><span class="price">$150</span> <span class="price old-price">$250</span> <span class="more"><a href="#"><i class="icon-link"></i></a></span></p>
										</div>
									</div>
								</div>
							</div>
							<div class="item">
								<div class="classes">
									<div class="classes-img" style="background-image: url(images/classes-2.jpg);">
									</div>
									<div class="wrap">
										<div class="desc">
											<span class="teacher">David Clarson</span>
											<h3><a href="#">Developing Mobile Apps Using Ruby on Rails</a></h3>
										</div>
										<div class="pricing">
											<p><span class="price">$150</span> <span class="price old-price">$250</span> <span class="more"><a href="#"><i class="icon-link"></i></a></span></p>
										</div>
									</div>
								</div>
							</div>
							<div class="item">
								<div class="classes">
									<div class="classes-img" style="background-image: url(images/classes-3.jpg);">
									</div>
									<div class="wrap">
										<div class="desc">
											<span class="teacher">David Clarson</span>
											<h3><a href="#">Developing Mobile Apps Using Ruby on Rails</a></h3>
										</div>
										<div class="pricing">
											<p><span class="price">$150</span> <span class="price old-price">$250</span> <span class="more"><a href="#"><i class="icon-link"></i></a></span></p>
										</div>
									</div>
								</div>
							</div>
							<div class="item">
								<div class="classes">
									<div class="classes-img" style="background-image: url(images/classes-4.jpg);">
									</div>
									<div class="wrap">
										<div class="desc">
											<span class="teacher">David Clarson</span>
											<h3><a href="#">Developing Mobile Apps Using Ruby on Rails</a></h3>
										</div>
										<div class="pricing">
											<p><span class="price">$150</span> <span class="price old-price">$250</span> <span class="more"><a href="#"><i class="icon-link"></i></a></span></p>
										</div>
									</div>
								</div>
							</div>
							<div class="item">
								<div class="classes">
									<div class="classes-img" style="background-image: url(images/classes-5.jpg);">
									</div>
									<div class="wrap">
										<div class="desc">
											<span class="teacher">David Clarson</span>
											<h3><a href="#">Developing Mobile Apps Using Ruby on Rails</a></h3>
										</div>
										<div class="pricing">
											<p><span class="price">$150</span> <span class="price old-price">$250</span> <span class="more"><a href="#"><i class="icon-link"></i></a></span></p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>	
		</div> -->
		<!-- <div id="colorlib-counter" class="colorlib-counters">
			<div class="container">
				<div class="col-md-7">
					<div class="about-desc">
						<div class="about-img-1 animate-box" style="background-image: url(images/about-img-2.jpg);"></div>
						<div class="about-img-2 animate-box" style="background-image: url(images/about-img-1.jpg);"></div>
					</div>
				</div>
				<div class="col-md-5">
					<div class="row">
						<div class="col-md-12 colorlib-heading animate-box">
							<h1 class="heading-big">Who are we</h1>
							<h2>Who are we</h2>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12 animate-box">
							<p><strong>Even the all-powerful Pointing has no control about the blind texts</strong></p>
							<p>Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life One day however a small line of blind text by the name of Lorem Ipsum decided to leave for the far World of Grammar.</p>
						</div>
						<div class="col-md-6 col-sm-6 animate-box">
							<div class="counter-entry">
								<div class="desc">
									<span class="colorlib-counter js-counter" data-from="0" data-to="1539" data-speed="5000" data-refresh-interval="50"></span>
									<span class="colorlib-counter-label">Courses</span>
								</div>
							</div>
						</div>
						<div class="col-md-6 col-sm-6 animate-box">
							<div class="counter-entry">
								<div class="desc">
									<span class="colorlib-counter js-counter" data-from="0" data-to="3653" data-speed="5000" data-refresh-interval="50"></span>
									<span class="colorlib-counter-label">Students</span>
								</div>
							</div>
						</div>
						<div class="col-md-6 col-sm-6 animate-box">
							<div class="counter-entry">
								<div class="desc">
									<span class="colorlib-counter js-counter" data-from="0" data-to="2300" data-speed="5000" data-refresh-interval="50"></span>
									<span class="colorlib-counter-label">Teachers online</span>
								</div>
							</div>
						</div>
						<div class="col-md-6 col-sm-6 animate-box">
							<div class="counter-entry">
								<div class="desc">
									<span class="colorlib-counter js-counter" data-from="0" data-to="200" data-speed="5000" data-refresh-interval="50"></span>
									<span class="colorlib-counter-label">Countries</span>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div id="colorlib-testimony" class="testimony-img" style="background-image: url(images/img_bg_2.jpg); margin-bottom: 4em;" data-stellar-background-ratio="0.5">
			<div class="overlay"></div>
			<div class="container-fluid">
				<div class="row">
					<div class="col-md-12 center-heading text-center colorlib-heading animate-box">
						<h1 class="heading-big">What are the students says</h1>
						<h2>What are the students says</h2>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="testimony-flex">
							<div class="one-fifth animate-box">
								<span class="icon"><i class="icon-quotes-left"></i></span>
								<div class="testimony-wrap">
									<blockquote>
										<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
									</blockquote>
									<div class="desc">
										<div class="figure-img" style="background-image: url(images/person1.jpg);"></div>
										<h3>Dave Henderson</h3>
									</div>
								</div>
							</div>
							<div class="one-fifth animate-box">
								<span class="icon"><i class="icon-quotes-left"></i></span>
								<div class="testimony-wrap">
									<blockquote>
										<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics.</p>
									</blockquote>
									<div class="desc">
										<div class="figure-img" style="background-image: url(images/person2.jpg);"></div>
										<h3>Dave Henderson</h3>
									</div>
								</div>
							</div>
							<div class="one-fifth animate-box">
								<span class="icon"><i class="icon-quotes-left"></i></span>
								<div class="testimony-wrap">
									<blockquote>
										<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.</p>
									</blockquote>
									<div class="desc">
										<div class="figure-img" style="background-image: url(images/person3.jpg);"></div>
										<h3>Dave Henderson</h3>
									</div>
								</div>
							</div>
							<div class="one-fifth animate-box">
								<span class="icon"><i class="icon-quotes-left"></i></span>
								<div class="testimony-wrap">
									<blockquote>
										<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove</p>
									</blockquote>
									<div class="desc">
										<div class="figure-img" style="background-image: url(images/person1.jpg);"></div>
										<h3>Dave Henderson</h3>
									</div>
								</div>
							</div>
							<div class="one-fifth animate-box">
								<span class="icon"><i class="icon-quotes-left"></i></span>
								<div class="testimony-wrap">
									<blockquote>
										<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics.</p>
									</blockquote>
									<div class="desc">
										<div class="figure-img" style="background-image: url(images/person1.jpg);"></div>
										<h3>Dave Henderson</h3>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="colorlib-trainers">
			<div class="container">
				<div class="row">
					<div class="col-md-12 colorlib-heading center-heading text-center animate-box">
						<h1 class="heading-big">Our Instructor</h1>
						<h2>Our Instructor</h2>
					</div>
				</div>
				<div class="row">
					<div class="col-md-3 col-sm-3 animate-box">
						<div class="trainers-entry">
							<div class="desc">
								<h3>Olivia Young</h3>
								<span>instructor</span>
							</div>
							<div class="trainer-img" style="background-image: url(images/person1.jpg)"></div>
						</div>
					</div>

					<div class="col-md-3 col-sm-3 animate-box">
						<div class="trainers-entry">
							<div class="desc">
								<h3>Daniel Anderson</h3>
								<span>Instructor</span>
							</div>
							<div class="trainer-img" style="background-image: url(images/person2.jpg)"></div>
						</div>
					</div>

					<div class="col-md-3 col-sm-3 animate-box">
						<div class="trainers-entry">
							<div class="desc">
								<h3>David Brook</h3>
								<span>Instructor</span>
							</div>
							<div class="trainer-img" style="background-image: url(images/person3.jpg)"></div>
						</div>
					</div>

					<div class="col-md-3 col-sm-3 animate-box">
						<div class="trainers-entry">
							<div class="desc">
								<h3>Brigeth Smith</h3>
								<span>instructor</span>
							</div>
							<div class="trainer-img" style="background-image: url(images/person4.jpg)"></div>
						</div>
					</div>
				</div>
			</div>
		</div> -->

		<!-- <div class="colorlib-classes">
			<div class="container">
				<div class="row">
					<div class="col-md-12 colorlib-heading center-heading text-center animate-box">
						<h1 class="heading-big">Our Courses</h1>
						<h2>Our Courses</h2>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4 animate-box">
						<div class="classes">
							
							<div class="wrap">
								<div class="desc">
									<span class="teacher">David Clarson</span>
									<h3><a href="#">Developing Mobile Apps Using Ruby on Rails</a></h3>
								</div>
								<div class="pricing">
									<p><span class="price">$150</span> <span class="price old-price">$250</span> <span class="more"><a href="#"><i class="icon-link"></i></a></span></p>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-4 animate-box">
						<div class="classes">
							<div class="classes-img" style="background-image: url(images/classes-2.jpg);">
							</div>
							<div class="wrap">
								<div class="desc">
									<span class="teacher">David Clarson</span>
									<h3><a href="#">Developing Mobile Apps Using Ruby on Rails</a></h3>
								</div>
								<div class="pricing">
									<p><span class="price">$150</span> <span class="price old-price">$250</span> <span class="more"><a href="#"><i class="icon-link"></i></a></span></p>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-4 animate-box">
						<div class="classes">
							<div class="classes-img" style="background-image: url(images/classes-3.jpg);">
							</div>
							<div class="wrap">
								<div class="desc">
									<span class="teacher">David Clarson</span>
									<h3><a href="#">Developing Mobile Apps Using Ruby on Rails</a></h3>
								</div>
								<div class="pricing">
									<p><span class="price">$150</span> <span class="price old-price">$250</span> <span class="more"><a href="#"><i class="icon-link"></i></a></span></p>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-4 animate-box">
						<div class="classes">
							<div class="classes-img" style="background-image: url(images/classes-4.jpg);">
							</div>
							<div class="wrap">
								<div class="desc">
									<span class="teacher">David Clarson</span>
									<h3><a href="#">Developing Mobile Apps Using Ruby on Rails</a></h3>
								</div>
								<div class="pricing">
									<p><span class="price">$150</span> <span class="price old-price">$250</span> <span class="more"><a href="#"><i class="icon-link"></i></a></span></p>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-4 animate-box">
						<div class="classes">
							<div class="classes-img" style="background-image: url(images/classes-5.jpg);">
							</div>
							<div class="wrap">
								<div class="desc">
									<span class="teacher">David Clarson</span>
									<h3><a href="#">Developing Mobile Apps Using Ruby on Rails</a></h3>
								</div>
								<div class="pricing">
									<p><span class="price">$150</span> <span class="price old-price">$250</span> <span class="more"><a href="#"><i class="icon-link"></i></a></span></p>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-4 animate-box">
						<div class="classes">
							<div class="classes-img" style="background-image: url(images/classes-6.jpg);">
							</div>
							<div class="wrap">
								<div class="desc">
									<span class="teacher">David Clarson</span>
									<h3><a href="#">Developing Mobile Apps Using Ruby on Rails</a></h3>
								</div>
								<div class="pricing">
									<p><span class="price">$150</span> <span class="price old-price">$250</span> <span class="more"><a href="#"><i class="icon-link"></i></a></span></p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>	
		</div> -->

		<!-- <div class="colorlib-event">
			<div class="container">
				<div class="row">
					<div class="col-md-5 row-pb-md">
						<div class="row">
							<div class="col-md-12 colorlib-heading animate-box">
								<h1 class="heading-big">Events</h1>
								<h2>Upcoming Events</h2>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<div class="event-entry animate-box">
									<div class="desc">
										<p class="meta"><span class="day">01-02</span><span class="month">Jun</span></p>
										<p class="organizer"><span>Organized by:</span> <span>Noah Henderson</span></p>
										<h2><a href="event.html">We Held Free Training for Basic Programming</a></h2>
									</div>
									<div class="location">
										<span class="icon"><i class="icon-map"></i></span>
										<p>291 South 21th Street, Suite 721 New York NY 10016</p>
									</div>
								</div>
								<div class="event-entry animate-box">
									<div class="desc">
										<p class="meta"><span class="day">05-07</span><span class="month">Jun</span></p>
										<p class="organizer"><span>Organized by:</span> <span>Noah Henderson</span></p>
										<h2><a href="event.html">We Held Free Training for Basic Programming</a></h2>
									</div>
									<div class="location">
										<span class="icon"><i class="icon-map"></i></span>
										<p>291 South 21th Street, Suite 721 New York NY 10016</p>
									</div>
								</div>
								<div class="event-entry animate-box">
									<div class="desc">
										<p class="meta"><span class="day">10-12</span><span class="month">Jun</span></p>
										<p class="organizer"><span>Organized by:</span> <span>Noah Henderson</span></p>
										<h2><a href="event.html">We Held Free Training for Basic Programming</a></h2>
									</div>
									<div class="location">
										<span class="icon"><i class="icon-map"></i></span>
										<p>291 South 21th Street, Suite 721 New York NY 10016</p>
									</div>
								</div>
								<div class="event-entry animate-box">
									<div class="desc">
										<p class="meta"><span class="day">19-25</span><span class="month">Jun</span></p>
										<p class="organizer"><span>Organized by:</span> <span>Noah Henderson</span></p>
										<h2><a href="event.html">We Held Free Training for Basic Programming</a></h2>
									</div>
									<div class="location">
										<span class="icon"><i class="icon-map"></i></span>
										<p>291 South 21th Street, Suite 721 New York NY 10016</p>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-7 row-pb-md">
						<div class="row">
							<div class="col-md-12 colorlib-heading animate-box">
								<h1 class="heading-big">Recent Blog</h1>
								<h2>Recent Blog</h2>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<div class="block-21 d-flex animate-box">
					            <a href="#" class="blog-img" style="background-image: url(images/blog-1.jpg);"></a>
					            <div class="text">
					               <h3 class="heading"><a href="#">Even the all-powerful Pointing has no control about the blind texts</a></h3>
					               <p>ven the all-powerful Pointing has no control about the blind texts it is an almost</p>
					               <div class="meta">
					                  <div><a href="#"><span class="icon-calendar"></span> May 29, 2018</a></div>
					                  <div><a href="#"><span class="icon-user2"></span> Admin</a></div>
					                  <div><a href="#"><span class="icon-chat"></span> 19</a></div>
					               </div>
					            </div>
					         </div>

					         <div class="block-21 d-flex animate-box">
					            <a href="#" class="blog-img" style="background-image: url(images/blog-2.jpg);"></a>
					            <div class="text">
					               <h3 class="heading"><a href="#">Even the all-powerful Pointing has no control about the blind texts</a></h3>
					               <p>ven the all-powerful Pointing has no control about the blind texts it is an almost</p>
					               <div class="meta">
					                  <div><a href="#"><span class="icon-calendar"></span> May 29, 2018</a></div>
					                  <div><a href="#"><span class="icon-user2"></span> Admin</a></div>
					                  <div><a href="#"><span class="icon-chat"></span> 19</a></div>
					               </div>
					            </div>
					         </div>

					         <div class="block-21 d-flex animate-box">
					            <a href="#" class="blog-img" style="background-image: url(images/blog-3.jpg);"></a>
					            <div class="text">
					               <h3 class="heading"><a href="#">Even the all-powerful Pointing has no control about the blind texts</a></h3>
					               <p>ven the all-powerful Pointing has no control about the blind texts it is an almost</p>
					               <div class="meta">
					                  <div><a href="#"><span class="icon-calendar"></span> May 29, 2018</a></div>
					                  <div><a href="#"><span class="icon-user2"></span> Admin</a></div>
					                  <div><a href="#"><span class="icon-chat"></span> 19</a></div>
					               </div>
					            </div>
					         </div>

					         <div class="block-21 d-flex animate-box">
					            <a href="#" class="blog-img" style="background-image: url(images/blog-4.jpg);"></a>
					            <div class="text">
					               <h3 class="heading"><a href="#">Even the all-powerful Pointing has no control about the blind texts</a></h3>
					               <p>ven the all-powerful Pointing has no control about the blind texts it is an almost</p>
					               <div class="meta">
					                  <div><a href="#"><span class="icon-calendar"></span> May 29, 2018</a></div>
					                  <div><a href="#"><span class="icon-user2"></span> Admin</a></div>
					                  <div><a href="#"><span class="icon-chat"></span> 19</a></div>
					               </div>
					            </div>
					         </div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div> -->


		<!-- <div class="colorlib-blog colorlib-light-grey">
			<div class="container">
				<div class="row">
					<div class="col-md-8 col-md-offset-2 text-center colorlib-heading animate-box">
						<h2>Recent News</h2>
						<p>Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life One day however a small line of blind text by the name</p>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6 animate-box">
						<article class="article-entry">
							<a href="blog.html" class="blog-img" style="background-image: url(images/blog-1.jpg);">
								<p class="meta"><span class="day">18</span><span class="month">Apr</span></p>
							</a>
							<div class="desc">
								<h2><a href="blog.html">Creating Mobile Apps</a></h2>
								<p class="admin"><span>Posted by:</span> <span>James Smith</span></p>
								<p>Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life. The Big Oxmox advised her not to do so, because there were thousands of bad Commas, wild Question Marks and devious Semikoli, but the Little Blind Text didn’t listen. She packed her seven versalia, put her initial into the belt and made herself on the way.</p>
							</div>
						</article>
					</div>
					<div class="col-md-6">
						<div class="f-blog animate-box">
							<a href="blog.html" class="blog-img" style="background-image: url(images/blog-1.jpg);">
							</a>
							<div class="desc">
								<h2><a href="blog.html">How to Create Website in Scratch</a></h2>
								<p class="admin"><span>04 March 2018</span></p>
								<p>Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life</p>
							</div>
						</div>
						<div class="f-blog animate-box">
							<a href="blog.html" class="blog-img" style="background-image: url(images/blog-2.jpg);">
							</a>
							<div class="desc">
								<h2><a href="blog.html">How to Convert PSD File to HTML File?</a></h2>
								<p class="admin"><span>04 March 2018</span></p>
								<p>Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life</p>
							</div>
						</div>
						<div class="f-blog animate-box">
							<a href="blog.html" class="blog-img" style="background-image: url(images/blog-3.jpg);">
							</a>
							<div class="desc">
								<h2><a href="blog.html">How to Build Games App in Mobile</a></h2>
								<p class="admin"><span>04 March 2018</span></p>
								<p>Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div> -->

	
		<!-- <div id="colorlib-subscribe" class="subs-img" style="background-image: url(images/img_bg_2.jpg);" data-stellar-background-ratio="0.5">
			<div class="overlay"></div>
			<div class="container">
				<div class="row">
					<div class="col-md-8 col-md-offset-2 text-center colorlib-heading animate-box">
						<h2>Subscribe Newsletter</h2>
						<p>Subscribe our newsletter and get latest update</p>
					</div>
				</div>
				<div class="row animate-box">
					<div class="col-md-6 col-md-offset-3">
						<div class="row">
							<div class="col-md-12">
							<form class="form-inline qbstp-header-subscribe">
								<div class="col-three-forth">
									<div class="form-group">
										<input type="text" class="form-control" id="email" placeholder="Enter your email">
									</div>
								</div>
								<div class="col-one-third">
									<div class="form-group">
										<button type="submit" class="btn btn-primary">Subscribe Now</button>
									</div>
								</div>
							</form>
  							</div>
						</div>
					</div>
				</div>
			</div>
		</div> -->
		<footer id="colorlib-footer">
			<div class="container">
				<div class="row row-pb-md">
                        <div class="col-md-3 colorlib-widget">
                                <h4>ADDRESS</h4>
                                <ul class="colorlib-footer-links">
                                    <li> No 17/10, 28 , Basement, Dr Rajkumar Rd 3rd Stage, 4th <br>4th Block, Prakash Nagar, Rajajinagar, Bengaluru, Karnataka 560021</li>
                                    <!-- <li><a href="tel://1234567920"><i class="icon-phone"></i> +9886508214</a></li>
                                    <li><a href="mailto:info@yoursite.com"><i class="icon-envelope"></i>contact@x-workz.in</a></li>
                                    <li><a href="http://luxehotel.com"><i class="icon-location4"></i> yourwebsite.com</a></li> -->
                                </ul>
                            </div>
                            <div class="col-md-6 colorlib-widget"></div>
                            <div class="col-md-3 colorlib-widget">
                                    <h4>CONTACT INFO</h4>
                                    <ul class="colorlib-footer-links">
                                        <!-- <li> No 17/10, 28 , Basement, Dr Rajkumar Rd 3rd Stage, 4th <br>4th Block, Prakash Nagar, Rajajinagar, Bengaluru, Karnataka 560021</li> -->
                                        <li><a href="tel://1234567920"><i class="icon-phone"></i> +9886508214</a></li>
                                        <li><a href="mailto:info@yoursite.com"><i class="icon-envelope"></i>contact@x-workz.in</a></li>
                                        <li><a href="http://luxehotel.com"><i class="icon-location4"></i> yourwebsite.com</a></li>
                                    </ul>
                                </div>
					      
					<!-- <div class="col-md-2 colorlib-widget">
						<h4>Useful Links</h4>
						<p>
							<ul class="colorlib-footer-links">
								<li><a href="#"><i class="icon-check"></i> About Us</a></li>
								<li><a href="#"><i class="icon-check"></i> Testimonials</a></li>
								<li><a href="#"><i class="icon-check"></i> Courses</a></li>
								<li><a href="#"><i class="icon-check"></i> Event</a></li>
								<li><a href="#"><i class="icon-check"></i> News</a></li>
								<li><a href="#"><i class="icon-check"></i> Contact</a></li>
							</ul>
						</p>
					</div> -->

					<!-- <div class="col-md-2 colorlib-widget">
						<h4>Support</h4>
						<p>
							<ul class="colorlib-footer-links">
								<li><a href="#"><i class="icon-check"></i> Documentation</a></li>
								<li><a href="#"><i class="icon-check"></i> Forums</a></li>
								<li><a href="#"><i class="icon-check"></i> Help &amp; Support</a></li>
								<li><a href="#"><i class="icon-check"></i> Scholarship</a></li>
								<li><a href="#"><i class="icon-check"></i> Student Transport</a></li>
								<li><a href="#"><i class="icon-check"></i> Release Status</a></li>
							</ul>
						</p>
					</div> -->

					<!-- <div class="col-md-3 colorlib-widget">
						<h4>Recent Post</h4>
						<div class="f-blog">
							<a href="blog.html" class="blog-img" style="background-image: url(images/blog-1.jpg);">
							</a>
							<div class="desc">
								<h2><a href="blog.html">Creating Mobile Apps</a></h2>
								<p class="admin"><span>18 April 2018</span></p>
							</div>
						</div>
						<div class="f-blog">
							<a href="blog.html" class="blog-img" style="background-image: url(images/blog-2.jpg);">
							</a>
							<div class="desc">
								<h2><a href="blog.html">Creating Mobile Apps</a></h2>
								<p class="admin"><span>18 April 2018</span></p>
							</div>
						</div>
					</div> -->
				</div>
			</div>
			<div class="copy">
				<div class="container">
					<div class="row">
						<div class="col-md-12 text-center">
							<p>
								<small class="block">&copy; <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="icon-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></small><br> 
								<small class="block">Demo Images: <a href="http://unsplash.co/" target="_blank">Unsplash</a>, <a href="http://pexels.com/" target="_blank">Pexels</a></small>
							</p>
						</div>
					</div>
				</div>
			</div>
		</footer>
	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up2"></i></a>
	</div>
	
	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Stellar Parallax -->
	<script src="js/jquery.stellar.min.js"></script>
	<!-- Flexslider -->
	<script src="js/jquery.flexslider-min.js"></script>
	<!-- Owl carousel -->
	<script src="js/owl.carousel.min.js"></script>
	<!-- Magnific Popup -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>
	<!-- Counters -->
	<script src="js/jquery.countTo.js"></script>
	<!-- Main -->
	<script src="js/main.js"></script>

	</body>
</html>

