package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ImsiDAO;
import util.ServletUtil;

/**
 * Servlet implementation class ImsiServlet
 */
@WebServlet("/imsi")
public class ImsiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ImsiDAO id = new ImsiDAO();
		id.selectAll();
		
		
		ServletUtil.goJSP(request, response, "/WEB-INF/jsp/imsi.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
