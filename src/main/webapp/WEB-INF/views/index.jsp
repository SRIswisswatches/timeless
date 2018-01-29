	<html>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	    <head >
	        <title>Shop for Switzerland brand watches</title>
	        <meta charset="UTF-8">
	        <meta name="viewport" content="width=device-width, initial-scale=1.0">
	        
	      <!-- Start WOWSlider.com HEAD section -->
<link rel="stylesheet" type="text/css" href="resources/engine1/style.css" />
<script type="text/javascript" src="resources/engine1/jquery.js"></script>
<!-- End WOWSlider.com HEAD section -->
	         
<style type="text/css">
html {
	height: 100%;
}
body {
	background: url(resources/images/bg/background.jpg) !important;
	padding: 0px;
	height: 100%;
}
.wrapper {
	min-height: 100%;
	position: relative;
}
.content{
	padding-bottom: 60px;
}
embed {
align-content: center;
}
#timeless {
font-family: Comic Sans MS;
 color: #000033;
    text-shadow: 0 1px 0 #999999, 0 2px 0 #888888,
             0 3px 0 #777777, 0 4px 0 #666666,
             0 5px 0 #555555, 0 6px 0 #444444,
             0 7px 0 #333333, 0 8px 7px rgba(0, 0, 0, 0.4),
             0 9px 10px rgba(0, 0, 0, 0.2);
}

#about{
font-family: Arial Black;
color: #000033;
font-style: oblique;
margin-top: 350px;

}
.logo{
margin-top: 20px;
}

</style>
	         
	         </head>
	         <body> 
	   <%@ include file="header.jsp" %>     
          
	    <div class="container">                        
	    <div class="row">
	    <div id="header" class="col-md-12">
	     
	    <h2 id="timeless" align="center"><img src="resources/images/logo1.jpg" height="100px" width="100px" class="logo" style="padding-top: 1px">TIMELESS SWISS LUXURY !!! </h2>
	    </div>
	    </div>
	          </div>
	        
	 
	 <!-- Start WOWSlider.com BODY section -->
<div id="wowslider-container1">
<div class="ws_images"><ul>
		<li><img src="resources/data1/images/cartier.jpg" alt="CARTIER" title="CARTIER" id="wows1_0"/></li>
		<li><img src="resources/data1/images/longines.jpg" alt="LONGINES" title="LONGINES" id="wows1_1"/></li>
		<li><img src="resources/data1/images/omega_sa.jpg" alt="Omega SA" title="Omega SA" id="wows1_2"/></li>
		
		<li><img src="resources/data1/images/rado.jpg" alt="RADO" title="RADO" id="wows1_3"/></li>
		<li><img src="resources/data1/images/rolex.jpg" alt="ROLEX" title="ROLEX" id="wows1_4"/></li>
		<li><img src="resources/data1/images/swatch.jpg" alt="SWATCH" title="SWATCH" id="wows1_5"/></li>
		
		<li><a href="http://wowslider.net"><img src="resources/data1/images/tag_heuer.jpg" alt="carousel jquery" title="TAG Heuer" id="wows1_6"/></a></li>
		<li><img src="resources/data1/images/tissot.jpg" alt="TISSOT" title="TISSOT" id="wows1_7"/></li>
	</ul></div>
	<div class="ws_thumbs">
<div>
		<a href="#" title="CARTIER"><img src="resources/data1/tooltips/cartier.jpg" alt="" /></a>
		<a href="#" title="LONGINES"><img src="resources/data1/tooltips/longines.jpg" alt="" /></a>
		<a href="#" title="Omega SA"><img src="resources/data1/tooltips/omega_sa.jpg" alt="" /></a>
		<a href="#" title="RADO"><img src="resources/data1/tooltips/rado.jpg" alt="" /></a>
		<a href="#" title="ROLEX"><img src="resources/data1/tooltips/rolex.jpg" alt="" /></a>
		<a href="#" title="SWATCH"><img src="resources/data1/tooltips/swatch.jpg" alt="" /></a>
		<a href="#" title="TAG Heuer"><img src="resources/data1/tooltips/tag_heuer.jpg" alt="" /></a>
		<a href="#" title="TISSOT"><img src="resources/data1/tooltips/tissot.jpg" alt="" /></a>
	</div>
</div>
<div class="ws_script" style="position:absolute;left:-99%"><a href="http://wowslider.net">slider</a> by WOWSlider.com v8.8</div>
<div class="ws_shadow"></div>
</div>	
<script type="text/javascript" src="resources/engine1/wowslider.js"></script>
<script type="text/javascript" src="resources/engine1/script.js"></script>
<!-- End WOWSlider.com BODY section -->

<div class="wrapper">
		<div class="content">
		<%@ include file="displayproduct.jsp"%>
		</div>
	</div>
      
<div class=container>
<h1 id="about" align="center">About Us</h1>
<p> Watches, as we know, are a reflection of your persona and style. They represent your taste, individuality and character and are no longer just a utility. They have also been seen as a status symbol since time immemorial. Since the 16th century when watches were introduced, the wrist watch has become a fashion statement while being an essential accessory for both men and women. With their features, design and mechanism evolving with time and age, there have materialised brilliant watch makers creating time pieces that may even be considered WORKS OF ART. They feature the finest of materials and most delicate mechanisms with high quality gems and jewellery put together with the expertise of the trained eye, and is seen as a privilege to be possessed.
Finding the perfect watch to match your taste and individuality can be top priority and we at SWISS BRANDS make it our business to provide the best as well as a wide range of luxury watches to suit every mood and style of yours. While we do know and believe that a few great time pieces can be got at competitive prices, we provide you with a guide to understanding some of the worlds top luxury watches enabling you to choose from the best! This understanding will help you with your refined taste and in choosing the one that pleases your aesthetic sense. Being prime examples of luxury watch range these are internationally acclaimed brands that are popular for both their appeal and functionality.</p>
</div>
<footer class="container-fluid text-center bg-grey">
<a href="#mypage" title="To Top">
<span class="glyphicon glyphicon-chevron-up"></span>
</a>
<p>© COPYRIGHTED All Rights Reserved </p>
</footer>

 <c:choose>
	  	     <c:when test="${not empty signupButtonClicked}">
     
    <%@include file="/WEB-INF/views/signup.jsp" %>
     </c:when>
     </c:choose>
     
     <c:choose>
	  	     <c:when test="${not empty signupButtonClicked}">
     
    <%@include file="/WEB-INF/views/login.jsp" %>
     </c:when>
     </c:choose>
	  	   </body>
	  	   
	  	   
	   </html>  
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	        