package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	
	
	public static Connection getCon() {
		Connection con = null;
		try {
			final String DB_NAME = "store";
			final String DRIVER = "org.mariadb.jdbc.Driver";
			final String URL = "jdbc:mysql://localhost/" + DB_NAME;
			final String USER_NAME = "root";
			final String PASSWORD = "koreait";
					
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			
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
        