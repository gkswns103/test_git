package ex4_continue;

public class Ex2_continue {
	public static void main(String[] args) {
		
		int n = 0;
		
		while(n < 10) {
			n++;
			if(n % 3 == 0) {
				continue;
			}
			System.out.println(n);
		}
		
	}
}
