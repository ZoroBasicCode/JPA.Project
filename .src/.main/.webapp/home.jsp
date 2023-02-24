<%@page import="org.SRK.UserApp.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="hstyle.css">
</head>
<body>

<% User u=(User) session.getAttribute("user");
if(u!=null){%>
<form>
<table>
<tr><td><button id="view"><a href="fetch.jsp">ViewDetails</a></button></td>
<td><button id="edit"><a href="edit.jsp">Edit</a></button></td>
<td><button id="del"><a href="delete?id=<%=u.getId()%>">Delete this User</a></button></td>
<tr><td id="logout"><a href="Logout">Logout</a></td></tr>
</table>
</form>
<%}
else{
	response.sendRedirect("Login.jsp");
}%>
</body>
</html>
