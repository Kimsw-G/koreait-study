package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.BoardVo;

/**
 * Servlet implementation class BoardModifyServlet
 */
@WebServlet("/modify")
public class BoardModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		request.setAttribute("vo", Database.list.get(no-1));
		request.setAttribute("no", no);
		
		request.getRequestDispatcher("/WEB-INF/jsp/modify.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		int no = Integer.parseInt(request.getParameter("no"));
		// 수정할 vo 를 가져오기!!
		BoardVo vo = Database.list.get(no-1);
		vo.setTitle(title);
		vo.setCtnt(ctnt);

		response.sendRedirect("/detail?no="+no);
	}

}
