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
@WebServlet("/delete")
public class Delete extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		Userdao dao=new Userdao();
		dao.DeleteUser(id);
		HttpSession session=req.getSession();
		session.invalidate();
		PrintWriter writer=resp.getWriter();
		writer.write("<html><body><h1> Account is deleted </h1></body></html>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("Login.jsp");
		dispatcher.include(req, resp);
	}
}
