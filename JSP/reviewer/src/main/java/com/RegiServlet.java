package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StoreDAO;
import model.StoreVo;

@WebServlet("/regi")
public class RegiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] ftype = {"한식","양식","중식","일식","기타"};
		request.setAttribute("ftype", ftype);
		
		request.setCharacterEncoding("UTF-8");
		request.getRequestDispatcher("regi").forward(request, response);
		
		// 
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String ctnt = request.getParameter("ctnt");
		String ftype = request.getParameter("ftype");
		
		StoreVo vo = new StoreVo(name, ctnt, ftype);
		StoreDAO sd = new StoreDAO();
		sd.insertStore(vo);
		
		response.sendRedirect("/hello");
		
	}

}
