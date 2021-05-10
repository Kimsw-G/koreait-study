package util;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletUtil {
	
	public static void goJSP(HttpServletRequest request, HttpServletResponse response,String uri)throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/"+uri+".jsp").forward(request, response);
	}
	
	public static String getParamString(HttpServletRequest request, String paraName) {
		return request.getParameter(paraName);
	}
	
	public static int getParamInt(HttpServletRequest request, String paramName) {
		String value = getParamString(request, paramName);
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}
