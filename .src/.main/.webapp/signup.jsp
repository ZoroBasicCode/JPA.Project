<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="sstyle.css">
</head>
<body>
<form action="signup" method="post">
<table id="myform">
<tr>
<td><label>Name</label></td>
<td><input type="text" name="nm"></td>
</tr>
<tr>
<td><label>Phone</label></td>
<td><input type="tel" name="ph"></td>
</tr>
<tr>
<td><label>Email</label></td>
<td><input type="email" name="em"></td>
</tr>
<tr>
<td><label>Password</label></td>
<td><input type="password" name="ps"></td>
</tr>
<tr><th colspan="2"><input id="sign" type="submit" value="Sign up"></th></tr>
</table>
</form>
</body>
</html>
