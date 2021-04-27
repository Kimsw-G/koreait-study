package model;

public class StoreVo {
	private int storeKey;
	private String name;
	private String ctnt;
	
	public StoreVo() {
		
	}
	
	public StoreVo(String name, String ctnt) {
		this.name = name;
		this.ctnt = ctnt;
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
	
	
	
	
}
