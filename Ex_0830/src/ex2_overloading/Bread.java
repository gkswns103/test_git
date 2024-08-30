package ex2_overloading;

public class Bread {

	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
		System.out.println("-------------");
	}
	
	public void makeBread(int n) {
		for(int i =0; i < n; i++) {
			System.out.println("빵을 만들었습니다");
		}
		System.out.println(n+ "개의 빵을 만들었습니다.");
		System.out.println("-------------");
	}
	
	public void makeBread(String s , int n) {
		for(int i =0; i < n; i++) {
			System.out.println(s + "을 만들었습니다");
		}
		System.out.println(n + "개의" + s + "을 만들었습니다.");
		System.out.println("-------------");
	}
	
}
