<%@page import="jdbc.beans.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	
	List<Employee> list  =   (List<Employee>) request.getAttribute("EMPS");
	System.out.println("in jsp " + list); 
	for(Employee temp: list){
		out.println(temp) ;
		/* temp.getEmpName();
		temp.getEmpDob();
		temp.getEmpEmail();
		temp.getEmpId(); */
	}

%>
</body>
</html>