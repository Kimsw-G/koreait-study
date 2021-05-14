package com.koreait.board5.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;

import com.koreait.board5.user.model.UserDAO;
import com.koreait.board5.user.model.UserVO;
import com.koreait.board5.utils.ServletUtil;

@WebServlet("/user/login")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletUtil.goJSP("user/userLogin", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserVO uv = new UserVO();
		uv.setUid(ServletUtil.getParamString("uid", request));
		uv.setUpw(ServletUtil.getParamString("upw", request));
		
		UserVO loginUser = UserDAO.selectUser(uv);
		if(loginUser == null) {
			request.setAttribute("errmsg", "없는 아이디!");
		}else if(BCrypt.checkpw(uv.getUpw(), loginUser.getUpw())) {//여긴 로그인 성공
			HttpSession session = request.getSession();
			loginUser.setUpw(null);
			session.setAttribute("loginUser",loginUser);
			response.sendRedirect("/board/list");
			return;
		}else {
			request.setAttribute("errmsg", "패스워드 오류!");		
		}
		doGet(request, response);
	}

}


