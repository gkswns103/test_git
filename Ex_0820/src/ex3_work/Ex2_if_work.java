package ex3_work;

import java.util.Scanner;

public class Ex2_if_work {
	public static void main(String[] args) {

		// 윤년 구하기
		// 윤년 : 연도가 4로 나눠 떨어지면 윤년
		// 연도가 100으로 나누어 떨어지는 해는 평년
		// -> 4년 주기에 포함되어 있어도 100으로 나눠 떨어지면 평년
		// 100으로 나눠지더라도 400으로도 나눠지면 윤년
		// 년도 :           - 입력
		// ~~년은 윤년입니다.  - 출력

		Scanner sc = new Scanner(System.in);

			System.out.print("년도 : ");
			int num1 = sc.nextInt();

			if(num1 % 4 == 0 && num1 % 100 != 0 || num1 % 400 == 0)
				System.out.println(num1 + "년은 윤년입니다");
			else
				System.out.println(num1 + "년은 평년입니다");
	}
}
/*
		if(num1 % 4 == 0) {
			if(num1 % 100 == 0 && num1 % 400 == 0) {
				System.out.println(num1 + "년은 윤년입니다");
			}
			else if(num1 % 100 == 0 || num1 % 400 == 0) {
				System.out.println(num1 + "년은 평년입니다");
			}
			else {
				System.out.println(num1 + "년은 윤년입니다");`
			}
		}
		else {
			System.out.println(num1 + "년은 평년입니다");
		}
 */

