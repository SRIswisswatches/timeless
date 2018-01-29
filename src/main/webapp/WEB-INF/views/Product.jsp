<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Product</title>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>


<%@include file="/WEB-INF/views/header.jsp" %>



  <c:choose>
     <c:when test="${not empty AddProductButtonClicked}">

      <%@include file="/WEB-INF/views/ProductForm.jsp" %>
     </c:when>

     <c:when test="${not empty ViewProductButtonClicked}">
       <%@include file="/WEB-INF/views/ViewProduct.jsp" %>

     </c:when>

     <c:when test="${not empty editProductClicked}">
       <%@include file="/WEB-INF/views/EditProduct.jsp" %>

     </c:when>

     </c:choose>
        <br><br><br>
</body>


</html>
