package com.haitekuya.sessiontest;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out;
        res.setContentType("text/html; charset=UTF-8");
        out = res.getWriter();
        out.println("Hello World! : ");
        HttpSession session = req.getSession(true);
        session.setAttribute("KEY01","DATA");
        out.println(session.getId());
	}

	private static final long serialVersionUID = 1L;
}