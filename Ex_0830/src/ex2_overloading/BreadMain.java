package ex2_overloading;

public class BreadMain {
	
	public static void main(String[] args) {
		
		Bread b = new Bread();
		// 1. 빵을 만들었습니다.
		b.makeBread();
		b.makeBread(2);
		b.makeBread("크림빵", 0);
	}
	
}
