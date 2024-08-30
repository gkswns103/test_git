package ex2_singleFor;

import java.util.Scanner;

public class Ex6_singleFor {
	public static void main(String[] args) {

		// 키보드에서 정수 n1,n2입력
		// n1부터 n2까지 합
		// n1 n2의 순서를 다르게 입력받아도 결과는 똑같이 출력가능
		int num3=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 :");
		int num1 = sc.nextInt();
		System.out.print("수2 :");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			num3 = num1;
			num1 = num2;
			num2 = num3;
		}
		for(int i=num1;i<=num2;i++) {
			sum += i;
		}
		System.out.printf("결과 : %d",sum);
	}

}

