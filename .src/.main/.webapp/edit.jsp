<%@page import="org.SRK.UserApp.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="estyle.css">
</head>
<body>

<%User u=(User) session.getAttribute("user");
if(u!=null){ %>
<form action="edit" method="post">
<table id="myform">
<tr>
<td><label>Id</label></td>
<td>:<input type="number" name="id" value="<%=u.getId()%>" readonly="readonly"></td>
</tr>
<tr>
<td><label>Name</label></td>
<td>:<input type="text" name="nm" value="<%=u.getName()%>"></td>
</tr>
<tr>
<td><label>Email</label></td>
<td>:<input type="email" name="em" value="<%=u.getMail()%>"></td>
</tr>
<tr>
<td><label>Phone</label></td>
<td>:<input type="tel" name="ph" value="<%=u.getPhon()%>"></td>
</tr>
<tr>
<td><label>Password</label></td>
<td>:<input type="password" name="ps" value="<%=u.getPassword()%>"></td>
</tr>
<tr><th colspan="2"><input id="up" type="submit" value="Update"></th></tr>
</table>
<%} 
else{
	response.sendRedirect("Login.jsp");
}
%>
</form>
</body>
</html>
