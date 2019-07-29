 <%--@author sandeep --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import = "CollegeManagementProject.src.training.project.*" %>
    <%@page import = "java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Student's Data</h1>
	<hr><br>
<%
StandardsFees f1= new FeesDAO();
List<Fees> temp = f1.getFeesDetails();
%>
<table style="border: 1px solid black">
		<tr>
			<th>Id</th>
			<th>fees_to_be_paid</th>
			<th>fine_to_be_paid</th>
			<th>amount_paid</th>
			<th>outstanding_amount</th>
			
		</tr>
		<%  for(Fees f :temp) {%>
		<tr>
			<td><%out.println(f.getsId());%></td>
			<td><%out.println(f.fees);%></td>
			<td><%out.println(f.fine_amount);%></td>
			<td><%out.println(f.fees_paid);%></td>
			<td><%out.println((f.fees+f.fine_amount-f.fees_paid));%></td>
		
		</tr>
		<%}%>

	</table>


</body>
</html>