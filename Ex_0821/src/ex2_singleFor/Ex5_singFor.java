package ex2_singleFor;

import java.util.Scanner;

public class Ex5_singFor {
	public static void main(String[] args) {
		
		// 키보드에서 정수 n을 입력받는다
		// 1부터 n까지의 합을 게산하여 걸과를 출력
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 :");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
			sum +=i;
		
		System.out.printf("결과 : %d",sum);
	}
}
