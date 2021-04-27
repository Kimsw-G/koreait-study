package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.BoardVo;

@WebServlet("/like")
public class BoardLikeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no")); // 게시글 번호가 반환
		BoardVo vo = Database.list.get(no-1); // list는 번호 -1
		vo.plusLike();
		
		String uri = "/detail?no="+no; // 
		response.sendRedirect(uri);
	}

}
