<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter Teacher Details</h1>
	<hr><br><br>
<form action="addteacherservlet" method="get">
Enter Teacher name
<input type="text" name="name"><br><br>
Enter Teacher age
<input type="number" name="age"><br><br>
Enter Teacher Subject
<input type="text" name="subject"><br><br>
Enter Teacher Mobile Number
<input type="text" name="mob"><br><br>
Enter Teacher Email
<input type="text" name="email"><br><br>
Enter Teacher Address
<input type="text" name="address"><br><br>
<input type="Submit">

</form>


</body>
</html>