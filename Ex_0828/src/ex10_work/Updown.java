package ex10_work;

public class Updown {
	
	public String check(int r,int n) {
		// 키보드에서 받은 값이 정답인지 up down인지 판단
		if(r < n) {
			return "DOWN";
		}
		else if( r > n){
			return "UP";
		}
		else {
			return "SAME";
		}
	}
	
}
