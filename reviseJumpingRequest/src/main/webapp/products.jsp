<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String name=(String) session.getAttribute("name"); %>
<h1>Now You Can Buy <%= name %> </h1>
<a href="profile.jsp" >Click For Profile</a>
</body>
</html>