<!DOCTYPE html>
<html lang="en">
<head>
<title>Mail Us</title>
<!-- custom-theme -->
<%@ include file="/include/header.jsp"%>
</head>
	
<body>
<!-- banner -->
	<div class="banner1">
		<nav class="navbar navbar-default">
			<div class="navbar-header navbar-left">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<h1><a class="navbar-brand" href="index.html"><span>E</span>difying</a></h1>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
				<nav class="link-effect-2" id="link-effect-2">
					<ul class="nav navbar-nav">
						<li><a href="index.html"><span data-hover="Home">Home</span></a></li>
						<li><a href="courses.html"><span data-hover="Courses">Courses</span></a></li>
						<li><a href="services.html"><span data-hover="Services">Services</span></a></li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span data-hover="Short Codes">Short Codes</span> <b class="caret"></b></a>
							<ul class="dropdown-menu agile_short_dropdown">
								<li><a href="icons.html">Web Icons</a></li>
								<li><a href="typography.html">Typography</a></li>
							</ul>
						</li>
						<li class="active"><a href="mail.html"><span data-hover="Mail Us">Mail Us</span></a></li>
					</ul>
				</nav>
			</div>
			<div class="w3_agile_phone">
				<p><i class="fa fa-phone" aria-hidden="true"></i> +123 234 233</p>
			</div>
		</nav>
		<div class="wthree_banner1_info">
			<div class="container">
				<h3><span>Mail</span> Us</h3>
			</div>
		</div>
	</div>
<!-- //banner -->	
<!-- mail -->
	<div class="courses">
		<div class="container">
			<div class="w3_agile_team_grid">
				<div class="w3_agile_team_grid_left">
					<p>01</p>
					<span class="glyphicon glyphicon-arrow-down" aria-hidden="true"></span>
				</div>
				<div class="w3_agile_team_grid_right">
					<h3>Get in <span>touch</span> with us</h3>
					<p>Aliquam sit amet sapien felis. Proin vel dolor sed risus maximus gravida. 
						Ut suscipit orci sem, eget lobortis sem dictum eu. Etiam congue ex sed volutpat fringilla.</p>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="agileits_w3layouts_team_grids agileits_mail_grids">
				<div class="col-md-6 agileinfo_mail_grid_left">
					<form action="#" method="post">
						<span class="input input--nariko">
							<input class="input__field input__field--nariko" name="Name" type="text" id="input-20" placeholder=" " required="" />
							<label class="input__label input__label--nariko" for="input-20">
								<span class="input__label-content input__label-content--nariko">Your Name</span>
							</label>
						</span>
						<span class="input input--nariko">
							<input class="input__field input__field--nariko" name="Email" type="email" id="input-21" placeholder=" " required="" />
							<label class="input__label input__label--nariko" for="input-21">
								<span class="input__label-content input__label-content--nariko">Your Email</span>
							</label>
						</span>
						<span class="input input--nariko">
							<input class="input__field input__field--nariko" name="Subject" type="text" id="input-22" placeholder=" " required="" />
							<label class="input__label input__label--nariko" for="input-22">
								<span class="input__label-content input__label-content--nariko">Your Subject</span>
							</label>
						</span>
						<textarea name="Message" placeholder="Your message here..." required=""></textarea>
						<input type="submit" value="Send">
					</form>
				</div>
				<div class="col-md-6 agileinfo_mail_grid_right">
					<div class="agileinfo_mail_social_right">
						<div class="agileinfo_mail_social_rightl">
							<a href="#" class="w3_contact_facebook">
								<i class="fa fa-facebook" aria-hidden="true"></i>
								<p>Facebook</p>
							</a>
						</div>
						<div class="agileinfo_mail_social_rightr">
							<a href="#" class="w3_contact_twitter">
								<i class="fa fa-twitter" aria-hidden="true"></i>
								<p>Twitter</p>
							</a>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="agileinfo_mail_social_right">
						<div class="agileinfo_mail_social_rightl">
							<a href="#" class="w3_contact_google">
								<i class="fa fa-google-plus" aria-hidden="true"></i>
								<p>Google+</p>
							</a>
						</div>
						<div class="agileinfo_mail_social_rightr">
							<a href="#" class="w3_contact_instagram">
								<i class="fa fa-instagram" aria-hidden="true"></i>
								<p>Instagram</p>
							</a>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="agileinfo_mail_social_right">
						<div class="agileinfo_mail_social_right_social">
							<a href="#" class="w3_contact_rss">
								<i class="fa fa-rss"></i>
								<p>RSS</p>
							</a>
						</div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<div class="agile_map">
		<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3950.3905851087434!2d-34.90500565012194!3d-8.061582082752993!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x7ab18d90992e4ab%3A0x8e83c4afabe39a3a!2sSport+Club+Do+Recife!5e0!3m2!1sen!2sin!4v1478684415917" style="border:0"></iframe>
	</div>
<!-- //mail -->
<!-- footer -->
	<%@ include file="/include/footer.jsp"%>
<!-- //footer -->
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