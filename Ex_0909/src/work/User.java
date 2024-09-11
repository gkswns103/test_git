package work;

import java.io.Serializable;

public class User implements Serializable{

	private String id;
	private int win;
	private int draw;
	private int lose;

	public User() { //생성자에서 초기화
		this.win = 0;
		this.draw = 0;
		this.lose = 0;
	}
	
	public int getWin() {
		return win;
	}

	public void setWin() {
		this.win += 1;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw() {
		this.draw += 1;
	}

	public int getLose() {
		return lose;
	}

	public void setLose() {
		this.lose += 1;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
