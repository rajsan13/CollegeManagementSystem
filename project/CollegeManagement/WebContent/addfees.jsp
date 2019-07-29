<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Student's Fees Details</h1>
	<hr><br><br>
<form action="addfeesservlet">
Enter student Id
<input type="number" name="id"><br><br>
Enter fees_to_be_paid
<input type="number" name="feestobepaid"><br><br>
Enter fine_to_be_paid
<input type="number" name="finetobepaid"><br><br>
Enter amount_paid
<input type="number" name="amountpaid"><br><br>
<input type="submit">
</form>
</body>
</html>