package Ex6_label;

import java.util.Scanner;

public class Ex4_label_work {
	public static void main(String[] args) {

		// 2 ~ 12 사이의 값을 입력받는다
		// 1부터 6까지 숫자로 이루어진 두개의 주사위가 던져졌을때
		// 합이 키보드에서 입력받은 값이 되는 첫번째 경우의 수를 출력

		Scanner sc = new Scanner(System.in);

		out: while (true) {
			System.out.print("값 :");
			int num = sc.nextInt();
			if (num <= 1 || num > 12) {
				System.out.println("올바른 값을 입력하시오");
				continue;
			} else {
				for (int i = 1; i <= 6; i++) {
					for (int j = 1; j <= 6; j++) {
						if (num == (i + j)) {
							System.out.printf("(%d, %d)", i, j);
							break out;
						}
					}
				}
			}
		}

	}
}
