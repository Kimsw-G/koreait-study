package com.koreait.board5.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.board5.user.model.UserDAO;
import com.koreait.board5.user.model.UserVO;
import com.koreait.board5.utils.ServletUtil;

@WebServlet("/user/regist")
public class UserRegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletUtil.goJSP("user/userRegist", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserVO uv = new UserVO();
		if (ServletUtil.getParamString("upw", request).equals(ServletUtil.getParamString("upwck", request))) {
			uv.setUid(ServletUtil.getParamString("uid", request));
			uv.setUnm(ServletUtil.getParamString("unm", request));
			uv.setGender(ServletUtil.getParamInt("gender", request));
			uv.setUpw(ServletUtil.getHashedString("upw", request));
			UserDAO.insertUser(uv);
			
			// 넣었으니까 login화면으로 가기
			response.sendRedirect("/user/login");
			return;
		}
		request.setAttribute("errFlag", 1);
		doGet(request, response);
		
	}

}


