package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;

public class StoreDAO {
	
	final int PAGELEN = 10;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void insertStore(StoreVo vo)  {
		
		try {
			con = JDBCUtil.getCon();
			String sql = "insert into store(name,ctnt,ftype) values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getCtnt());
			pstmt.setString(3, vo.getFtype());
			pstmt.executeUpdate();
			con.close();	
		} catch (Exception e) {
		} finally {
		}
	}
	
	public List<StoreVo> selectStore(int page){
		List<StoreVo> list = new ArrayList<StoreVo>();
		ReviewDAO rd = new ReviewDAO();
		page--;//편한 연산을 위해 -1 하기
		try {
			con = JDBCUtil.getCon();
			if(page == 0) {
				String sql = "select * from store order by storekey desc limit ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, PAGELEN);
			}else {
				String sql = "select * from store order by storekey desc limit ?,?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, page*PAGELEN);
				pstmt.setInt(2, PAGELEN);
			}
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				StoreVo vo = new StoreVo();
				vo.setStoreKey(Integer.parseInt(rs.getString("storekey")));
				vo.setName(rs.getString("name"));
				vo.setCtnt(rs.getString("ctnt"));
				vo.setFtype(rs.getString("ftype"));
				vo.setAvg(rd.getStarAvg(vo.getStoreKey()));
				list.add(vo);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int getPageSize() {
		int cnt = 0;
		try {
			con = JDBCUtil.getCon();
			String sql = "select count(*) as cnt from store"; // 게시물이 몇개인지 반환!
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				cnt = rs.getInt("cnt");
			}
			con.close();
		} catch (Exception e) {
			System.out.println("못구했지롱");
		}
		return 1+cnt/PAGELEN;
	}
	
	public List<StoreVo> selectSepStore(String key,String value){
		List<StoreVo> list = new ArrayList<StoreVo>();
		ReviewDAO rd = new ReviewDAO();
		try {
			con = JDBCUtil.getCon();
			String sql = "select * from store where "+key+" like ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%"+value+"%");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				StoreVo vo = new StoreVo();
				vo.setStoreKey(Integer.parseInt(rs.getString("storekey")));
				vo.setName(rs.getString("name"));
				vo.setCtnt(rs.getString("ctnt"));
				vo.setFtype(rs.getString("ftype"));
				vo.setAvg(rd.getStarAvg(vo.getStoreKey()));
				list.add(vo);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	public StoreVo selectVo(int key) {
		StoreVo vo = new StoreVo();
		try {
			con = JDBCUtil.getCon();
			String sql = "select * from store where storekey=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, key);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setStoreKey(Integer.parseInt(rs.getString("storekey")));
				vo.setName(rs.getString("name"));
				vo.setCtnt(rs.getString("ctnt"));
			}
			con.close();
		} catch (Exception e) {
		}
		
		return vo;
	}
}
