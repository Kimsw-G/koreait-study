package com.koreait.first;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list3")
public class BoardList3Svlt extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	// 쿼리 스트링 날리기~~~
	// get방식 날림
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println(name);
		System.out.println(age);
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		
		
		String jsp = "/";
		RequestDispatcher rd = request.getRequestDispatcher(jsp); // requestDispatcher 객체를 반환
		rd.forward(request, response);
		
	}

}


