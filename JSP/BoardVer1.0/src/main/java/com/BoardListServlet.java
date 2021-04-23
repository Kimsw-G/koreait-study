package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.BoardVo;

@WebServlet("/list")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String jsp = "/WEB-INF/jsp/list.jsp";
//		RequestDispatcher rd = q.getRequestDispatcher(jsp);
//		rd.forward(q, p);
		// 한 줄로 요약 가능~~~~
		
		// from browser to svr => getParameter
		// from servlet to jsp => setAttribute
		List<BoardVo> temp = Database.list;
		
	
		request.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doGet(request, response);
	}

}
