package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import util.JDBCUtil;

public class ReviewDAO {

	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	
	public void insertReview(ReviewVo vo, int key) {
		try {
			con = JDBCUtil.getCon();
			String sql = "insert into review values(?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			pstmt.setString(2, vo.getId());
			pstmt.setString(3, vo.getPw());
			pstmt.setInt(4, vo.getStar());
			pstmt.setString(5, vo.getCtnt());
			pstmt.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println("값이 안 들어갔음");
			e.printStackTrace();
		}
	}
	
	public List selectReview(int key) {
		List<ReviewVo> list = new ArrayList();
		try {
			con = JDBCUtil.getCon();
			String sql = "select * from review where storekey = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ReviewVo vo = new ReviewVo();
				vo.setId(rs.getString("id"));
				vo.setPw(rs.getString("pw"));
				vo.setStar(rs.getInt("star"));
				vo.setCtnt(rs.getString("ctnt"));
				list.add(vo);
			}
			con.close();
		} catch (Exception e) {
		}
		return list;
	}
	
	public double getStarAvg(int key) {
		double avg = -1;
		try {
			con = JDBCUtil.getCon();
			String sql = "select avg(star) as avg from review where storekey=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				avg = rs.getDouble("avg");
			}
			con.close();
		} catch (Exception e) {
		}
		return avg;
	}
	
	public List<Double> getStarAvgs() {
		List<Double> list = new ArrayList();
		try {
			con = JDBCUtil.getCon();
			String sql = "select avg(star) as avg from review";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(rs.getDouble("avg"));
			}
			con.close();
		} catch (Exception e) {
		}
		return list;
	}
	
	
}
