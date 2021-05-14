package com.koreait.board5.utils;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;

import com.koreait.board5.user.model.UserVO;

public class ServletUtil {
	public static void goJSP(String uri, HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/"+uri+".jsp").forward(request, response);
	}
	
	public static String getParamStrings(String str, HttpServletRequest request) {
		String[] strArray = request.getParameterValues(str);
		String result = "";
		for (String string : strArray) {
			result += string;
		}
		return result;
	}
	
	public static String getParamString(String str, HttpServletRequest request) {
		return request.getParameter(str);
	}
	
	public static int getParamInt(String str, HttpServletRequest request) {
		return Integer.parseInt(getParamString(str, request));
	}
	
	public static String getHashedString(String str, HttpServletRequest request) {
		return BCrypt.hashpw(getParamString(str, request), BCrypt.gensalt());
	}
	
	public static UserVO getSessionInfo(HttpServletRequest request) {
		HttpSession session = request.getSession();
		return (UserVO)session.getAttribute("loginUser");
	}
	public static int getSessionPk(HttpServletRequest request) {
		return getSessionInfo(request).getIuser();
	}
}
