package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;


import util.JDBCUtil;

public class SeatAppDAO {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public List<SeatAppVO> selectStu(){
		List<SeatAppVO> list = new ArrayList<SeatAppVO>();
		try {
			con = JDBCUtil.getCon();
			String sql = "select * from student";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				SeatAppVO sv = new SeatAppVO();
				sv.setName(rs.getString("name"));
				sv.setStuKey(rs.getInt("stukey"));
				list.add(sv);
			}
			JDBCUtil.close(con, pstmt, rs);
		} catch (Exception e) {
			System.out.println("ㄴㄴ");
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void insertSeat(int no, SeatAppVO sv) {
		try {
			con = JDBCUtil.getCon();
			String sql = "insert into seat (seatkey,stukey) values(?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.setInt(2, sv.getStuKey());
			pstmt.executeUpdate();
			con.close();
			JDBCUtil.close(con, pstmt);
		} catch (Exception e) {
		}
	}
	
	public List<SeatAppVO> selectSeat() {
		List<SeatAppVO> list = new ArrayList<SeatAppVO>();
		try {
			con = JDBCUtil.getCon();
			String sql = "select a.stukey,a.name,b.seatkey from student a join seat b on a.stukey=b.stukey";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				SeatAppVO vo = new SeatAppVO();
				vo.setStuKey(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setSeatKey(rs.getInt(3));
				list.add(vo);
			}
			JDBCUtil.close(con, pstmt, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void clearSeat() {
		try {
			con = JDBCUtil.getCon();
			String sql = "delete from seat";
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			JDBCUtil.close(con, pstmt);
		} catch (Exception e) {
		}
	}
	
}
