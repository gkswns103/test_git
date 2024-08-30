package ex3_break;

import java.util.Scanner;

public class Ex6_break {
	public static void main(String[] args) {

		// 키보드에서 정수를 입력받고 소수인지를 판단

		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력: ");
		int su = sc.nextInt();

 		int i = su - 1;
		for (; i >= 1; i--) {
			if (su % i == 0) {
				break;
			}
		}
		if (i == 1)
			System.out.println(su + " 는 소수");
		else
			System.out.println(su + " 는 소수아님");
	}
}