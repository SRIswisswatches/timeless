
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
div.gallery {
    margin: 10px;
    float: left;
    width: 200px;
    padding: 30px;
    
}

div.gallery img {
    width: 200px;
    height: 325px;
   
     
}

div.desc {
    padding: 15px;
    text-align: center;
}
#pn{
font-family: Comic Sans MS; 
color:blue;
 text-shadow: 0 0 5px #AEB6BF, 0 0 10px #AEB6BF,
             0 0 20px #AEB6BF, 0 0 30px #AEB6BF,
             0 0 40px #AEB6BF;

}
</style>
</head>
<body>
<c:forEach items="${productList}" var="product">

<div class="gallery">
  <a href="productdescription?productId=${product.productId}">
    <img align="middle" src="resources/swisswatches/${product.productId}.jpg" alt="${product.productId}" width=250px; height=250px;>
  </a>
  <div class="desc"><ul style="list-style-type:none">
  <li class="span2"><h5 id="pn" align="center" "color: blue" >${product.productName}</h5></li></ul></div>
</div>

</c:forEach>
</body>
</html>