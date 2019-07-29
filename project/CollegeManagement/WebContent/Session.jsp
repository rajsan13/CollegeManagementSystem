<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	HttpSession mysession = request.getSession();
	if(mysession.isNew()){
		%>
		<p> Welcome for the first time</p>
		<%
	}else{
		mysession.setMaxInactiveInterval(5);		%>
		<p> Welcome back</p>
		<p>Your sesison id is <%= mysession.getId() %></p>
		<p> Time is <%= new Date( mysession.getCreationTime()) %></p>
		<% 
	}


%>


</body>
</html>