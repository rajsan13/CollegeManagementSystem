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
	<h1 align="center">Teachers data </h1>
	<hr><br>
<%
StandardsTeachers st= new TeacherDao();
List<Teacher> temp = st.getAllTeachers();
%>
	<table style="border: 1px solid black">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Age</th>
			<th>Subject</th>
			<th>Mobile Number</th>
			<th>Email id</th>
			<th>Address</th>
		</tr>
		<%  for(Teacher t1 :temp) {%>
		<tr>
			<td><%out.println(t1.getTeacherId());%></td>
			<td><%out.println(t1.getTeacherName());%></td>
			<td><%out.println(t1.getTeacherAge());%></td>
			<td><%out.println(t1.getTeacherSubject());%></td>
			<td><%out.println(t1.getTeacherMobNo());%></td>
			<td><%out.println(t1.getTeacherEmail());%></td>
			<td><%out.println(t1.getTeacherAddress());%></td>
		</tr>
		<%}%>

	</table>
</body>
</html>