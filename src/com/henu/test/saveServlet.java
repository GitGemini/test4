package com.henu.test;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/saveServlet")
public class saveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		String message = request.getParameter("message");
		String msg = username+"@"+MessageUtil.getIPAddress()+" 说: "+message+"<br/>";
		System.out.println(msg);
		
		ServletContext app = getServletContext();
		String msgs = (String) app.getAttribute("msg");
		if(msgs==null) {
			msgs = "";
		}
		msgs += msg;
		app.setAttribute("msg", msgs);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
