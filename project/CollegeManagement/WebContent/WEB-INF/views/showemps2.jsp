<%@page import="jdbc.beans.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ps" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<ps:forEach items="${EMPS}" var="emp">

<tr>
	<td>${emp.empId }</td>
</tr>

</ps:forEach>
</body>
</html>