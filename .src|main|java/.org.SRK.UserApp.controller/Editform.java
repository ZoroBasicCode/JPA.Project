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

@WebServlet("/edit")
public class Editform extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		long phon=Long.parseLong(req.getParameter("ph"));
		String name=req.getParameter("nm");
		String mail=req.getParameter("em");
		String pasw=req.getParameter("ps");
		Userdao dao=new Userdao();
		User u=dao.findUser(id);
		u.setMail(mail);
		u.setName(name);
		u.setPassword(pasw);
		u.setPhon(phon);
		u=dao.UpdateUser(u);
		RequestDispatcher dispatcher=null;
		PrintWriter writer=resp.getWriter();
		if(u!=null) {
			writer.write("<html><body><h1> data is updated </h1></body></html>");
			dispatcher=req.getRequestDispatcher("Login.jsp");
			dispatcher.include(req, resp);
		}
		else {
			dispatcher=req.getRequestDispatcher("edit.jsp");
			dispatcher.include(req, resp);
		}
	}
}
