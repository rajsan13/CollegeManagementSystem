<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Select your Operation to be Performed</h1>
<hr>
<form>

<input type="submit" onclick = "form.action = ('addteacher.jsp');"  value="Add a Teacher"><br><br>
<input type="submit" onclick = "form.action = ('addstudent.jsp');"  value="Add a Student"><br><br>
<input type="submit" onclick = "form.action = ('showteacher.jsp');"  value="Show All Teacher Data"><br><br>
<input type="submit" onclick = "form.action = ('showstudent.jsp');"  value="Show All Student Data"><br><br>
<input type="submit" onclick = "form.action = ('addfees.jsp');"     value="Add Fees"><br><br>
<input type="submit" onclick = "form.action = ('showfees.jsp');"     value="Show Fees"><br><br>


</form>

</body>
</html>