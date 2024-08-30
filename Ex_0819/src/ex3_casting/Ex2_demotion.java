package ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		
		// 2. demotion casting
		// 작은 자료형에 큰 자료형이 대입되는 것
		
		char c = 'A';
		int n = c + 2;
		
		c = (char)n;
		
		System.out.println(c);
		
		float f = 5.5f;
		int i = 0;
		i = (int)f;
		System.out.println(i); 
	}
}
