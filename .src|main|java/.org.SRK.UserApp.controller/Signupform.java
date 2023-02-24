package org.SRK.UserApp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.SRK.UserApp.dao.Userdao;
import org.SRK.UserApp.dto.User;
@WebServlet("/signup")
public class Signupform extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	long phon=Long.parseLong(req.getParameter("ph"));
	String name=req.getParameter("nm");
	String mail=req.getParameter("em");
	String pasw=req.getParameter("ps");
	User u=new User();
	u.setName(name);
	u.setMail(mail);
	u.setPassword(pasw);
	u.setPhon(phon);
	Userdao dao=new Userdao();
	u=dao.SaveUser(u);
	PrintWriter writer=resp.getWriter();
	writer.write("<html><body><h1> data is inserted with id ="+u.getId()+"</h1></body></html>");
	RequestDispatcher dispatcher=req.getRequestDispatcher("Login.jsp");
	dispatcher.include(req, resp);
}
}
