<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="lstyle.css">
</head>
<body>
<form action="Login" method="post">
<table id="myform">
<tr>
<td><label>Phone :</label></td>
<td><input type="tel" name="ph"></td>
</tr>
<tr>
<td><label>Password</label></td>
<td><input type="password" name="ps"></td>
</tr>
<tr><th colspan="2" id="log"><input type="submit" value="Login"></th></tr>
<tr><th colspan="2" id="sign"><a href="signup.jsp">Signup</a></th></tr>
</table>
<br>

</form>
</body>
</html>
