package ex2_while;

public class Ex2_while {
	public static void main(String[] args) {
		
		// 1 = 1 2 3 4 5
		// 2 = 6 7 8 9 10
		// 3 = 11 12 13 14 15
		//
		// 5 = 21 22 23 24 25
		
		int cnt = 1;
		int num = 1;
		while(cnt <= 5) {
			System.out.printf("%d = ",cnt);
			for(int i = 1; i <= 5; i++) {
				System.out.printf("%d ",num++);
			}
			System.out.println();
			cnt++;
		}
		String str[] = {""};
	}
}
