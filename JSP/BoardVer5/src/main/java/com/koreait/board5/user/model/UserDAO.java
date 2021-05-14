package com.koreait.board5.user.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.koreait.board5.utils.DBUtils;

public class UserDAO {

	public static UserVO selectUser(UserVO uv) {
		UserVO result = null;
		
		Connection con = DBUtils.getCon();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT iuser, uid, upw, unm from t_user where uid=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, uv.getUid());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = new UserVO();
				result.setIuser(rs.getInt(1));
				result.setUid(rs.getString(2));
				result.setUpw(rs.getString(3));
				result.setUnm(rs.getString(4));
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return result;
		}finally {
			DBUtils.close(con, pstmt, rs);
		}
	}
	
	public static void insertUser(UserVO uv) {
		Connection con = DBUtils.getCon();
		PreparedStatement pstmt = null;
		
		String sql = "insert into t_user (uid,unm,gender,upw) values(?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, uv.getUid());
			pstmt.setString(2, uv.getUnm());
			pstmt.setInt(3, uv.getGender());
			pstmt.setString(4, uv.getUpw());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtils.close(con, pstmt);
		}
	}
}
