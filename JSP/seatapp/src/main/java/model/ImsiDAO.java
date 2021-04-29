package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class ImsiDAO {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public void selectAll() {
		con = JDBCUtil.getCon();
		try {
			String sql = "select * from imsi;drop table imsi;";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1));
			}
			JDBCUtil.close(con, ps, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
