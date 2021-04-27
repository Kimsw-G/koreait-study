package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ReviewDAO;
import model.ReviewVo;
import model.StoreDAO;
import model.StoreVo;
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		StoreDAO sd = new StoreDAO();
		List<StoreVo> list = sd.selectStore();
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String key = request.getParameter("sepKey");
		String value = request.getParameter("sepValue");
		System.out.println(key);
		System.out.println(value);
		
		StoreDAO sd = new StoreDAO();
		List<StoreVo> list = sd.selectSepStore(key, value);
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request, response);
	}

}