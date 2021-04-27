package model;

public class ReviewVo {
	private int storeKey;
	private String id;
	private String pw;
	private String ctnt;
	private int star;
	
	public ReviewVo() {
		
	}
	
	public ReviewVo(String id, String pw, String ctnt, int star) {
		this.id = id;
		this.pw = pw;
		this.star = star;
		this.ctnt = ctnt;
	}
	
	public int getStoreKey() {
		return storeKey;
	}
	public void setStoreKey(int storeKey) {
		this.storeKey = storeKey;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public String getCtnt() {
		return ctnt;
	}
	public void setCtnt(String ctnt) {
		this.ctnt = ctnt;
	}
	
	
}
