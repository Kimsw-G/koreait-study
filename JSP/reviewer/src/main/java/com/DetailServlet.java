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

@WebServlet("/detail")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int key = Integer.parseInt(request.getParameter("key"));
		StoreDAO sd = new StoreDAO();
		StoreVo store = sd.selectVo(key);
		ReviewDAO rd = new ReviewDAO();
		List<ReviewVo> list = rd.selectReview(key);
		request.setAttribute("store", store);
		request.setAttribute("list", list);
		
		// 조회수를 ++
		// 
		request.getRequestDispatcher("/WEB-INF/jsp/detail.jsp").forward(request, response);  // 페이지를 보여주는 순간
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int key = Integer.parseInt(request.getParameter("key"));
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String ctnt = request.getParameter("ctnt");
		int star = Integer.parseInt(request.getParameter("star"));
		
		ReviewVo vo = new ReviewVo(id, pw, ctnt, star);
		ReviewDAO rd = new ReviewDAO();
		rd.insertReview(vo, key); // 값을 집어넣기!!
		
		request.setAttribute("key", key);
		doGet(request, response);
	}

}
