<%@page import="org.SRK.UserApp.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="Ftyle.css">
</head>
<body>
<%User u=(User) session.getAttribute("user");
if(u!=null){ %>
<form>
<table id="myform">
<tr>
<td><label>ID </label></td>
<td>:<input value="<%=u.getId() %>" readonly="readonly"></td>
</tr>
<tr>
<td><label>Name </label></td>
<td>:<input value="<%=u.getName() %>" readonly="readonly"></td>
</tr>
<tr>
<td><label>Email </label></td>
<td>:<input value="<%=u.getMail() %>" readonly="readonly"></td>
</tr>
<tr>
<td><label>Phone </label></td>
<td>:<input value="<%=u.getPhon() %>" readonly="readonly"></td>
</tr>
<tr><th><button><a href="home.jsp" id="back">Back</a></button></th></tr>
</table>

</form>
<%}
else{

}%>
</body>
</html>
