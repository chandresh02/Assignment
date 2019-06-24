<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
        }

        * {
            box-sizing: border-box
        }

         body {
            /* display: inline-block;
    margin: 0px auto;  */
            text-align: center;
         }

        /* Full-width input fields */
        /* input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
} */

        hr {
            border: 100px solid #f1f1f1;
            margin-bottom: 25px;
        }

        /* Set a style for all buttons */
        button {
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 200%;
            opacity: 0.9;
        }

        button:hover {
            opacity: 1;
        }

        /* Extra styles for the cancel button */
        .cancelbtn {
            padding: 14px 20px;
            background-color: #f44336;
        }

        /* Float cancel and signup buttons and add an equal width */
        .cancelbtn,
        .signupbtn {
            float: left;
            width: 50%;
        }

        /* Add padding to container elements */
        .container {
            padding: 16px;
        }

        /* Clear floats */
        .clearfix::after {
            content: "";
            clear: both;
            display: table;
        }

        /* Change styles for cancel button and signup button on extra small screens */
        @media screen and (max-width: 300px) {

            .cancelbtn,
            .signupbtn {
                width: 100%;
            }
        }
    </style>

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Assignment Management</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="" />
        <meta name="keywords" content="" />
        <meta name="author" content="" />

        <!-- Facebook and Twitter integration -->
        <meta property="og:title" content="" />
        <meta property="og:image" content="" />
        <meta property="og:url" content="" />
        <meta property="og:site_name" content="" />
        <meta property="og:description" content="" />
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
</head>

<body>
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
                            <li class=""><a href="SignUp.jsp">SignUp</a></li>
                            
                            <li><a href="SignIn.jsp">SignIn</a></li>
                            <li><a href="UploadAssignment.jsp">Upload</a></li>

                            
                        </ul>
                    </div>	

                </div>
            </div>
        </div>
        <!-- <div class="top-menu">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-2">
                                <div id="colorlib-logo"><a href="index.html">ASSIGNMENT</a></div>
                            </div>
                            <div class="col-md-10 text-right menu-1">
                                <ul>
                                    <li class="active"><a href="index.html">Home</a></li>
                                    <li class="has-dropdown">
                                        <a href="courses.html">Courses</a>
                                        <ul class="dropdown">
                                            <li><a href="courses-single.html">Courses Single</a></li>
                                            <li><a href="#">Mobile Apps</a></li>
                                            <li><a href="#">Website</a></li>
                                            <li><a href="#">Web Design</a></li>
                                            <li><a href="#">WordPress</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="teachers.html">Teachers</a></li>
                                    <li><a href="about.html">About</a></li>
                                    <li><a href="event.html">Events</a></li>
                                    <li><a href="news.html">News</a></li>
                                    <li><a href="Signin.html">Signin</a></li>
                                    <li class="btn-cta"><a href="signup.html"><span>signup</span></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div> -->
    </nav>
    <div class="container">
                    <div style="margin-top: 100px">
                        <div class="col-md-2"></div>
                        <div class="col-md-8 container">
            <form action="signUp.ams" method="post"  style="border:1px solid #ccc">
                    <h1 style="background-color:Tomato;">Sign Up</h1>
                    <p>Please fill in this form to create an account.</p>
                    <hr>
                    <div class="form-group row"  >
                        <div class="col-md-4" style="padding-top: 12px">
                            <label for="firstname"></label><b>FirstName</b></label>
                        </div>
        
                        <div class="col-md-7">
                            <input type="text" class="form-control" placeholder="Enter FirstName" name="firstName" required>
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-md-4" style="padding-top: 12px">
                            <label for="lastname"><b>LastName</b></label>
                        </div>
                        <div class="col-md-7">
                            <input type="text" class="form-control" placeholder="Enter LastName" name="lastName" required>
                        </div>
                    </div>
                <div class="form-group row">
                    <div class="col-md-4" style="padding-top: 12px">
                        <label for="email"><b>Email</b></label>
                    </div>
                    <div class="col-md-7">
                        <input type="text" class="form-control" placeholder="Enter Email" name="emailId" required>
                    </div>
                </div>
                
                <div class="form-group row">
                        <div class="col-md-4" style="padding-top: 12px">
                            <label for="pin"><b>CountryCode</b></label>
                        </div>
                        <div class="col-md-7">
                         <!--    <input type="text" class="form-control" placeholder="" name="countryCode" required>  -->
                            <select data-plugin-selectTwo class="form-control populate" name="countryCode" required="required">
                                <option value="">Select</option>
                                    <option value="+91">+91</option>
                                    <option value="+92">+92</option>
                                    <option value="+93">+93</option>
                                    <option value="+94">+94</option>
                                    <option value="+95">+95</option>
                                    <option value="+95">+96</option>
                                    
                            </select>
                        </div>
                    </div>
                
                <div class="form-group row">
                    <div class="col-md-4" style="padding-top: 12px">
                        <label for="mobileNo"><b>PhoneNo.</b></label>
                    </div>
                    <div class="col-md-7">
                        <input type="text" class="form-control" placeholder="Enter Valid mobileNo" name="mobileNo" required>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-1"></div>
                    <!-- <div class="col-md-4"> -->
                        <button type="reset" class="col-md-4 cancelbtn">Cancel</button>
                    <!-- </div>           -->
                    <div class="col-md-2"></div>
                     <!-- <div class="col-md-4"> -->
                        <button type="submit" class="col-md-4 signupbtn">Sign Up</button>
                    <!-- </div> -->
                </div>

            </form>
        </div>
        <div class="col-md-2"></div>
            </div>
        </div>
       <!--  <aside id="colorlib-hero">
			<div class="flexslider">
				<ul class="slides">
			   	<li style="background-image: url(images/img_bg_4.jpg);">

			   	</li>
			  	</ul>
		  	</div>
		</aside> -->

		
    
    <footer id="colorlib-footer">
        <div class="container">
            <div class="row row-pb-md">
                <div class="col-md-3 colorlib-widget">
                    <h4>ADDRESS</h4>
                    <ul class="colorlib-footer-links">
                        <li> No 17/10, 28 , Basement, Dr Rajkumar Rd 3rd Stage, 4th <br>4th Block, Prakash Nagar,
                            Rajajinagar, Bengaluru, Karnataka 560021</li>
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
                            <small class="block">&copy;
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                Copyright &copy;
                                <script>document.write(new Date().getFullYear());</script> All rights reserved | This
                                template is made with <i class="icon-heart" aria-hidden="true"></i> by <a
                                    href="https://colorlib.com" target="_blank">Colorlib</a>
                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></small><br>
                            <small class="block">Demo Images: <a href="http://unsplash.co/"
                                    target="_blank">Unsplash</a>, <a href="http://pexels.com/"
                                    target="_blank">Pexels</a></small>
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