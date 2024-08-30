package ex3_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		
		//캐스팅(형변환)
		// 1. promotion casting
		// - 큰 자료형에 작은 자료형이 대입되는 것
		double dd = 100.5;
		int n = 200;
		dd = n;
		System.out.println(dd);
		
		char c = 'D';
		int i = 100;
		
		i = c;
		System.out.println(c); 
	}
}
