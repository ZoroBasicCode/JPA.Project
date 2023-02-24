package org.SRK.UserApp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.SRK.UserApp.dao.Userdao;
import org.SRK.UserApp.dto.User;


@WebServlet("/Login")
public class LoginForm extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		long phon=Long.parseLong(req.getParameter("ph"));
		String pasw=req.getParameter("ps");
		Userdao dao=new Userdao();
		User u=dao.verify(phon, pasw) ;
		RequestDispatcher dispatcher=null;
		PrintWriter writer=resp.getWriter();
		if(u!=null)
		{
			HttpSession session=req.getSession();
			session.setAttribute("user", u);
			dispatcher =req.getRequestDispatcher("home.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			writer.write("<html><body><h1> invalid cridentials  </h1></body></html>");
			dispatcher =req.getRequestDispatcher("Login.jsp");
			dispatcher.include(req, resp);
		}
	}
}
