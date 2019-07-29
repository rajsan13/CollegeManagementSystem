 <%--@author sandeep --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import = "CollegeManagementProject.src.training.project.*" %>
    <%@page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Student's Data</h1>
	<hr><br>
<%
StandardStudents st= new StudentDAO();
List<Student> temp = st.getAllStudents();
%>
<table style="border: 1px solid black">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Age</th>
			<th>Standard</th>
			<th>Division</th>
			<th>Mobile Number</th>
			<th>Address</th>
		</tr>
		<%  for(Student t1 :temp) {%>
		<tr>
			<td><%out.println(t1.getsId());%></td>
			<td><%out.println(t1.getName());%></td>
			<td><%out.println(t1.getAge());%></td>
			<td><%out.println(t1.getStandard());%></td>
			<td><%out.println(t1.getDivision());%></td>
			<td><%out.println(t1.getMobileno());%></td>
			<td><%out.println(t1.getAddress());%></td>
		</tr>
		<%}%>

	</table>


</body>
</html>