package com.koreait.board5.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.koreait.board5.utils.DBUtils;

public class BoardDAO {

	public static List<BoardVO> selectBoard() {
		List<BoardVO> list = new ArrayList<BoardVO>();
		
		Connection con = DBUtils.getCon();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from t_board";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setCtnt(rs.getString("ctnt"));
				vo.setIboard(rs.getInt("iboard"));
				vo.setIuser(rs.getInt("iuser"));
				vo.setRegdt(rs.getString("regdate"));
				vo.setTitle(rs.getString("title"));
				list.add(vo);
			}
		} catch (SQLException e) {
			
		} finally {
			DBUtils.close(con, pstmt, rs);
		}
		
		return list;
	}
}
