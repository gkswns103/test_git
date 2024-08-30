package ex4_work;

public class Ex3_work {
	public static void main(String[] args) {

		//     *4
		//    ***3
		//   *****2
		//  *******1
		// *********
		int cnt = 3;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 + i; j++) {
				if(j <= cnt)
					System.out.print("  ");
				else
					System.out.print("* ");

			}
			cnt--;
			System.out.println();
		}
		cnt = 1;
		for(int i = 3; i >= 0; i--) {
			for(int j = 0; j < i + 5; j++) {
				if(j < cnt)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			cnt++;
			System.out.println();
		}
	}
}
