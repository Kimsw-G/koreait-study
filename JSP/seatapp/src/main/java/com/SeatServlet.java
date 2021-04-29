package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SeatAppDAO;
import model.SeatAppVO;
import session.StudentListSession;
import util.ServletUtil;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/seat")
public class SeatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//POST로 올때만 학생 정보를 받는다.
//
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 좌석 클릭시 get방식으로 도착.
		int no = Integer.parseInt(request.getParameter("no"));
		SeatAppDAO sd = new SeatAppDAO();
		// 값을 insert 시킨 후, 첫번째 명단 지우기
		sd.insertSeat(no, StudentListSession.session.get(0));
		StudentListSession.session.remove(0);
		// 좌석에 있는 사람들 정보 가져오기
		List<SeatAppVO> seats = sd.selectSeat();
		
		request.setAttribute("list", StudentListSession.session); // 첫번째 값이 삭제된 리스트를 반환!
		request.setAttribute("seats", seats);
		
		ServletUtil.goJSP(request, response, "/WEB-INF/jsp/seat.jsp");
	}	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SeatAppDAO sd = new SeatAppDAO();
		// TODO:seat 테이블 삭제 테이블
		sd.clearSeat();
		// 학생들 정보가 담긴 리스트 반환
		List<SeatAppVO> list = sd.selectStu();
		// 초기에 넘겨줄 비어있는 seats
		List<SeatAppVO> seats = new ArrayList<SeatAppVO>();
		// 학생들 순서 섞어버리기
		Collections.shuffle(list); 
		// POST로 들어왔을때 한 번 정보를 받기
		StudentListSession.session = list; 
		
		request.setAttribute("list", list);
		request.setAttribute("seats", seats);
		
		ServletUtil.goJSP(request, response, "/WEB-INF/jsp/seat.jsp");
	}

}
