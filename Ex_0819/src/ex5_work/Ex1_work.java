package ex5_work;

public class Ex1_work {
	public static void main(String[] args) {
		
		/*
		 * 과수원(x)이 있다
		 * 배(a) 사과(b) 오렌지(c) 키우고 있다 하루에 생산되는거 각각 5 7 5
		 * 
		 * 1. 과수원 하루 생산 되는 과일의 총 갯수 출력
		 * 2. 전체 과일의 시간당 평균 생산갯수를 출력
		 *     aa bb cc
		 * 단, 시간당 평균을 담을 변수 타입은 float으로
		 * 각 과일의 갯수를 담을 변수타입은 int
		 * */
		
		int x;
		int a = 5 , b = 7 , c =5;
		float aa , bb , cc , xx; // 과일 시간당 생산 평균
		//1.
		x = a + b + c;
		System.out.println("과수원 하루 생산 량 : " + x);
		
		//2.
		aa = a / 24f;
		bb = b / 24f;
		cc = c / 24f;
		xx = x / 24f;
		System.out.println("각 과수원 과일의 시간당 평균");
		System.out.println("배 : " + aa  + " 사과 : " + bb + " 오렌지 : " + cc);
		System.out.println("전체 과일 시간당 평균");
		System.out.println(xx);
	}
}
