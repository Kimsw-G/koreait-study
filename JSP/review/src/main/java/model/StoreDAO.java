package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class StoreDAO {
	
	
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void getCon() {
		// 커넥션풀을 이용해 DB접근하기!
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
			System.out.println("연결 실패...");
		}
	}
	
	public void insertStore(StoreVo vo)  {
		
		try {
			getCon();
			String sql = "insert into store(name,ctnt) values(?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getCtnt());
			pstmt.executeUpdate();
			con.close();	
		} catch (Exception e) {
		} finally {
		}
	}
	
	public List<StoreVo> selectStore(){
		List<StoreVo> list = new ArrayList<StoreVo>();
		try {
			getCon();
			String sql = "select * from store";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				StoreVo vo = new StoreVo();
				vo.setStoreKey(Integer.parseInt(rs.getString("storekey")));
				vo.setName(rs.getString("name"));
				vo.setCtnt(rs.getString("ctnt"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	public StoreVo selectVo(int key) {
		StoreVo vo = new StoreVo();
		try {
			getCon();
			String sql = "select * from store where storekey=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setCtnt(rs.getString("ctnt"));
			}
		} catch (Exception e) {
		}
		
		return vo;
	}
}
