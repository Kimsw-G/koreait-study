package com;

import java.io.IOException;
import java.security.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mindrot.jbcrypt.BCrypt;

import secUtil.CryptoUtil;

@WebServlet("/sec")
public class HelloSecServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/hellosec.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
//		String pw = request.getParameter("pw");
//		System.out.println("password : " + pw);
//		
//		try {
//			String crpw = CryptoUtil.sha256(pw);
//			System.out.println("crypPassword : "+crpw);
//			String bwpw = BCrypt.hashpw(pw, BCrypt.gensalt());
//			System.out.println("bwPassword : "+bwpw);
//			System.out.println(bwpw.length());
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("암호화 실패!");
//		}
		
		String[] name = request.getParameterValues("name");
		for (String string : name) {
			System.out.println(string);
		}
		request.setAttribute("flagTrue", true);
		request.setAttribute("flagFalse", false);
		request.getRequestDispatcher("/WEB-INF/jsp/hellosec.jsp").forward(request, response);
	}

	

}
