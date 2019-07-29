<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@include file="Multiplication.jsp" %>


<h2>Multiplication table</h2>
<table border="3" border-color="Blue">
<%
int val= Integer.parseInt(request.getParameter("value"));
for(int i=1;i<=10;i++){
	%>
	<tr><td>
	<%=val  %>
	X
	<%= i %>
	=
	<%= val*i %>
	</td></tr>
<%} %>
</table>
</body>
</html>