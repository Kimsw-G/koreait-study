package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JDBCUtil {
	
	
	public static Connection getCon() {
		// 커넥션풀을 이용해 DB접근하기!
		Connection con = null;
		try {
			//외부에서 데이터 가져오기
			Context initctx = new InitialContext();
			//톰캣 서버에 정보를 담아놓은 곳으로 이동하기
			Context envctx = (Context) initctx.lookup("java:comp/env");
			//데이터 소스 객체를 선언
			DataSource ds = (DataSource) envctx.lookup("jdbc/pool");
			//데이터 소스를 기준으로 커넥션을 연결!
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ㄴㄴ");
		}
		return con;
	}
	
	public static void close(Connection con, PreparedStatement pstmt) throws SQLException{
		close(con, pstmt, null);
	}
	
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) throws SQLException {
		pstmt.close();
		rs.close();
		con.close();
	}
}
