<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Please Select the status of order</h1>
<form action="setvalue.obj">
<input type="radio" name="Status" value="Dispatched">Dispatched<br>
<input type="radio" name="Status" value="Shipped">Shipped<br>
<input type="radio" name="Status" value="Delivered">Delivered<br>
<button>Submit</button>
</form>
</body>
</html>