package util;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletUtil {
	
	public static void goJSP(HttpServletRequest request, HttpServletResponse response,String uri)throws ServletException, IOException {
		request.getRequestDispatcher(uri).forward(request, response);
	}
}
