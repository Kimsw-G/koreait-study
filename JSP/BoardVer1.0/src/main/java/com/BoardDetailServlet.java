package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/detail")
public class BoardDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO : get방식으로 받은 번호를 이용하여, 원하는 글 내용이 담긴 BoardVo 가져오기
		int no = Integer.parseInt(request.getParameter("no"));
		// vo로 BoardVo 보내기!
		request.setAttribute("vo", Database.list.get(no));
		
		request.getRequestDispatcher("/WEB-INF/jsp/detail.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
