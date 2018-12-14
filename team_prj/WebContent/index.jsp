<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Home</title>
<!-- custom-theme -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //custom-theme -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<!-- //js -->
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" property="" />
<!-- gallery -->
<link href="css/lsb.css" rel="stylesheet" type="text/css">
<!-- //gallery -->
<!-- font-awesome-icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome-icons -->
<link href="http://fonts.googleapis.com/css?family=Prompt:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=latin-ext,thai,vietnamese" rel="stylesheet"></head>
	
<body>
<!-- banner -->
	<%@ include file="/include/banner.jsp"%>
<!-- //banner -->	

<!-- team -->
	<div class="team w3_women_team" id="team">
		<div class="container">	
			<div class="w3_agile_team_grid">
				<div class="w3_agile_team_grid_left">
					<p>03</p>
					<span class="glyphicon glyphicon-arrow-down" aria-hidden="true"></span>
				</div>
				<div class="w3_agile_team_grid_right">
					<h3>meet our <span>edifying</span> team</h3>
					<p>Aliquam sit amet sapien felis. Proin vel dolor sed risus maximus gravida. 
						Ut suscipit orci sem, eget lobortis sem dictum eu. Etiam congue ex sed volutpat fringilla.</p>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="agileits_w3layouts_team_grids">
				<div class="col-md-4 agileits_w3layouts_team_grid">
					<h3>Jane Smith</h3>
					<p>Manager</p>
				<!-- 	<ul class="agileinfo_social_icons w3_agileits_social_icons">
						<li><a href="#" class="w3_agileits_facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
						<li><a href="#" class="wthree_twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
						<li><a href="#" class="agileinfo_google"><i class="fa fa-google-plus" aria-hidden="true"></i></a></li>
						<li><a href="#" class="agileits_pinterest"><i class="fa fa-pinterest-p" aria-hidden="true"></i></a></li>
					</ul> -->
					<img src="images/5.jpg" alt=" " class="img-responsive" />
				</div>
				<div class="col-md-4 agileits_w3layouts_team_grid">
					<h3>Belinda Paul</h3>
					<p>Creative Head</p>
		<!-- 			<ul class="agileinfo_social_icons w3_agileits_social_icons">
						<li><a href="#" class="w3_agileits_facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
						<li><a href="#" class="wthree_twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
						<li><a href="#" class="agileinfo_google"><i class="fa fa-google-plus" aria-hidden="true"></i></a></li>
						<li><a href="#" class="agileits_pinterest"><i class="fa fa-pinterest-p" aria-hidden="true"></i></a></li>
					</ul> -->
					<img src="images/6.jpg" alt=" " class="img-responsive" />
				</div>
				<div class="col-md-4 agileits_w3layouts_team_grid">
					<h3>Laura Doe</h3>
					<p>Head of the department</p>
					<!-- <ul class="agileinfo_social_icons w3_agileits_social_icons">
						<li><a href="#" class="w3_agileits_facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
						<li><a href="#" class="wthree_twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
						<li><a href="#" class="agileinfo_google"><i class="fa fa-google-plus" aria-hidden="true"></i></a></li>
						<li><a href="#" class="agileits_pinterest"><i class="fa fa-pinterest-p" aria-hidden="true"></i></a></li>
					</ul> -->
					<img src="images/7.jpg" alt=" " class="img-responsive" />
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!-- //team -->

<!-- bootstrap-pop-up -->
	<div class="modal video-modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					Edifying
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
				</div>
				<section>
					<div class="modal-body">
						<img src="images/10.jpg" alt=" " class="img-responsive" />
						<p>Ut enim ad minima veniam, quis nostrum 
							exercitationem ullam corporis suscipit laboriosam, 
							nisi ut aliquid ex ea commodi consequatur? Quis autem 
							vel eum iure reprehenderit qui in ea voluptate velit 
							esse quam nihil molestiae consequatur, vel illum qui 
							dolorem eum fugiat quo voluptas nulla pariatur.
							<i>" Quis autem vel eum iure reprehenderit qui in ea voluptate velit 
								esse quam nihil molestiae consequatur.</i></p>
					</div>
				</section>
			</div>
		</div>
	</div>
<!-- //bootstrap-pop-up -->
<!-- register -->
<!-- 	<div class="register">
		<div class="container">
			<div class="col-md-6 w3layouts_register_right">
				<form action="#" method="post">	
					<input name="Name" placeholder="First Name" type="text" required="">
					<input name="Name" placeholder="Last Name" type="text" required="">
					<input name="Email" placeholder="Email" type="email" required="">
					<input name="Subject" placeholder="Subject" type="text" required="">
					<input type="submit" value="Send">
				</form>
			</div>
			<div class="col-md-6 w3layouts_register_left">
				<h3><span>Register</span> now</h3>
				<p>Aliquam sit amet sapien felis. Proin vel dolor sed risus maximus gravida. 
					Ut suscipit orci sem, eget lobortis sem dictum eu. Etiam congue ex sed volutpat fringilla.</p>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
 --><!-- //register -->
<!-- testimonials -->
	<div class="testimonials">
		<div class="container">
			<div class="w3_agile_team_grid">
				<div class="w3_agile_team_grid_left">
					<p>05</p>
					<span class="glyphicon glyphicon-arrow-down" aria-hidden="true"></span>
				</div>
				<div class="w3_agile_team_grid_right">
					<h3>What Our <span>Students</span> Says</h3>
					<p>Aliquam sit amet sapien felis. Proin vel dolor sed risus maximus gravida. 
						Ut suscipit orci sem, eget lobortis sem dictum eu. Etiam congue ex sed volutpat fringilla.</p>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="w3ls_testimonials_grids">
				 <section class="center slider">
						<div class="agileits_testimonial_grid">
							<div class="w3l_testimonial_grid">
								<p>In eu auctor felis, id eleifend dolor. Integer bibendum dictum erat, 
									non laoreet dolor.</p>
								<h4>Rosy Crisp</h4>
								<h5>Student</h5>
								<div class="w3l_testimonial_grid_pos">
									<img src="images/1.png" alt=" " class="img-responsive" />
								</div>
							</div>
						</div>
						<div class="agileits_testimonial_grid">
							<div class="w3l_testimonial_grid">
								<p>In eu auctor felis, id eleifend dolor. Integer bibendum dictum erat, 
									non laoreet dolor.</p>
								<h4>Laura Paul</h4>
								<h5>Student</h5>
								<div class="w3l_testimonial_grid_pos">
									<img src="images/2.png" alt=" " class="img-responsive" />
								</div>
							</div>
						</div>
						<div class="agileits_testimonial_grid">
							<div class="w3l_testimonial_grid">
								<p>In eu auctor felis, id eleifend dolor. Integer bibendum dictum erat, 
									non laoreet dolor.</p>
								<h4>Michael Doe</h4>
								<h5>Student</h5>
								<div class="w3l_testimonial_grid_pos">
									<img src="images/3.png" alt=" " class="img-responsive" />
								</div>
							</div>
						</div>
				</section>
			</div>
		</div>
	</div>
<!-- //testimonials -->
<!-- gallery-top -->
	<!-- <div class="gallery-top">
		<div class="agileinfo_gallery_top">
			<h3><span>Education</span> is the most powerful weapon which you can use to change 
				the world</h3>
		</div>
	</div> -->
<!-- //gallery-top -->
<!-- gallery -->
	<div class="gallery">
		<ul id="flexiselDemo1">	
			<li>
				<div class="wthree_gallery_grid">
					<a href="images/8.jpg" class="lsb-preview" data-lsb-group="header">
						<div class="view second-effect">
							<img src="images/8.jpg" alt="" class="img-responsive" />
							<div class="mask">
								<p>Edifying</p>
							</div>
						</div>	
					</a>
				</div>
			</li>
			<li>
				<div class="wthree_gallery_grid">
					<a href="images/9.jpg" class="lsb-preview" data-lsb-group="header">
						<div class="view second-effect">
							<img src="images/9.jpg" alt="" class="img-responsive" />
							<div class="mask">
								<p>Edifying</p>
							</div>
						</div>	
					</a>
				</div>
			</li>
			<li>
				<div class="wthree_gallery_grid">
					<a href="images/10.jpg" class="lsb-preview" data-lsb-group="header">
						<div class="view second-effect">
							<img src="images/10.jpg" alt="" class="img-responsive" />
							<div class="mask">
								<p>Edifying</p>
							</div>
						</div>	
					</a>
				</div>
			</li>
			<li>
				<div class="wthree_gallery_grid">
					<a href="images/11.jpg" class="lsb-preview" data-lsb-group="header">
						<div class="view second-effect">
							<img src="images/11.jpg" alt="" class="img-responsive" />
							<div class="mask">
								<p>Edifying</p>
							</div>
						</div>	
					</a>
				</div>
			</li>
			<li>
				<div class="wthree_gallery_grid">
					<a href="images/12.jpg" class="lsb-preview" data-lsb-group="header">
						<div class="view second-effect">
							<img src="images/12.jpg" alt="" class="img-responsive" />
							<div class="mask">
								<p>Edifying</p>
							</div>
						</div>	
					</a>
				</div>
			</li>
		</ul>
	</div>
<!-- //gallery -->
<div class="tlinks">Collect from <a href="http://www.cssmoban.com/" >ç½é¡µæ¨¡æ¿</a></div>

<!-- footer -->
	<%@ include file="/include/footer.jsp"%>
<!-- //footer -->
<!-- carousal -->
	<script src="js/slick.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript">
		$(document).on('ready', function() {
		  $(".center").slick({
			dots: true,
			infinite: true,
			centerMode: true,
			slidesToShow: 2,
			slidesToScroll: 2,
			responsive: [
				{
				  breakpoint: 768,
				  settings: {
					arrows: true,
					centerMode: false,
					slidesToShow: 2
				  }
				},
				{
				  breakpoint: 480,
				  settings: {
					arrows: true,
					centerMode: false,
					centerPadding: '40px',
					slidesToShow: 1
				  }
				}
			 ]
		  });
		});
	</script>
<!-- //carousal -->
<!-- flexisel -->
		<script type="text/javascript">
		$(window).load(function() {
			$("#flexiselDemo1").flexisel({
				visibleItems: 4,
				animationSpeed: 1000,
				autoPlay: true,
				autoPlaySpeed: 3000,    		
				pauseOnHover: true,
				enableResponsiveBreakpoints: true,
				responsiveBreakpoints: { 
					portrait: { 
						changePoint:480,
						visibleItems: 1
					}, 
					landscape: { 
						changePoint:640,
						visibleItems:2
					},
					tablet: { 
						changePoint:768,
						visibleItems: 2
					}
				}
			});
			
		});
	</script>
	<script type="text/javascript" src="js/jquery.flexisel.js"></script>
<!-- //flexisel -->
<!-- gallery-pop-up -->
	<script src="js/lsb.min.js"></script>
	<script>
	$(window).load(function() {
		  $.fn.lightspeedBox();
		});
	</script>
<!-- //gallery-pop-up -->
<!-- flexSlider -->
	<script defer src="js/jquery.flexslider.js"></script>
	<script type="text/javascript">
		$(window).load(function(){
		  $('.flexslider').flexslider({
			animation: "slide",
			start: function(slider){
			  $('body').removeClass('loading');
			}
		  });
		});
	</script>
<!-- //flexSlider -->
<!-- banner-type-text -->
	<script src="js/typed.js" type="text/javascript"></script>
    <script>
		$(function(){

			$("#typed").typed({
				// strings: ["Typed.js is a <strong>jQuery</strong> plugin.", "It <em>types</em> out sentences.", "And then deletes them.", "Try it out!"],
				stringsElement: $('#typed-strings'),
				typeSpeed: 30,
				backDelay: 500,
				loop: false,
				contentType: 'html', // or text
				// defaults to false for infinite loop
				loopCount: false,
				callback: function(){ foo(); },
				resetCallback: function() { newTyped(); }
			});

			$(".reset").click(function(){
				$("#typed").typed('reset');
			});

		});

		function newTyped(){ /* A new typed object */ }

		function foo(){ console.log("Callback"); }
    </script>
<!-- //banner-type-text -->
<!-- start-smooth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- start-smooth-scrolling -->
<!-- for bootstrap working -->
	<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->
<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
<!-- //here ends scrolling icon -->
</body>
</html>