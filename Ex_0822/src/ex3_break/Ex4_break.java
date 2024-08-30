package ex3_break;

import java.util.Scanner;

public class Ex4_break {
	public static void main(String[] args) {
		
		// 정수 입력받아 1부터 입력받은 값까지 합을 구하되 합이 20을 넘으면 반복 종료
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i =1; i <= num; i++) {
			sum += i;
			if(sum > 20) {
				System.out.println("합이 20이 넘음");
				break;
			}
		}
		System.out.println(sum);
		
	}
}