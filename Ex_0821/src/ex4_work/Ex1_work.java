package ex4_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {

		// 키보드에서 입력받은 값까지 반복하는 피보나치 수열 만들기
		// 정수 : 5
		// 1 1 2 3 5 // 11 12 23 35 58 813
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 :");
		int num1 = sc.nextInt();
		int sum = 1;
		int cnt1 = 0; // 
		int cnt2 = 0; // 1
		for (int i = 0; i < num1; i++) { 
			System.out.printf("%d ",sum);
			cnt2 = sum;
			sum = cnt1 + cnt2;
			cnt1 = cnt2;
		}
	}
}
