package vo;

public class BoardVo {
	private int iboard;
	private String title;
	private String ctnt;
	private int like;
	
	
	public BoardVo(){
		like = 0;
	}
	
	public int getIboard() {
		return iboard;
	}
	public void setIboard(int iboard) {
		this.iboard = iboard;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCtnt() {
		return ctnt;
	}
	public void setCtnt(String ctnt) {
		this.ctnt = ctnt;
	}
	
	public int getLike() {
		return like;
	}
	public void plusLike() {//
		this.like++;
	}
	
	
	
}
