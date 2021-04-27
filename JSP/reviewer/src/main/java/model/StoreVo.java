package model;

public class StoreVo {
	private int storeKey;
	private String name;
	private String ctnt;
	private String ftype;
	private double avg; // db에 없는 값입니다!!
	
	public StoreVo() {
		
	}
	
	public StoreVo(String name, String ctnt, String ftype) {
		this.name = name;
		this.ctnt = ctnt;
		this.ftype = ftype;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStoreKey() {
		return storeKey;
	}

	public void setStoreKey(int storeKey) {
		this.storeKey = storeKey;
	}

	public String getCtnt() {
		return ctnt;
	}

	public void setCtnt(String ctnt) {
		this.ctnt = ctnt;
	}

	public String getFtype() {
		return ftype;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
	
}
