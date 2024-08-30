package ex2_singleFor;

import java.util.Scanner;

public class Ex3_singleFor {
	public static void main(String[] args) {

		// 1 ~ 10까지 홀수 
			/*
		int sum = 0;
	
		for(int i = 0; i < 11; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);


		for(int i =1; i < 11; i+=2) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		int i_sum = 0;
		int i = 1;
		do{
			i_sum += i;
			i += 2;
		}while(i<10);
		System.out.println(i_sum);
		*/
		
		// 키보드에서 원금과 예치일을 입력 받는다
		// 은행 이자는 하루에 1원씩 추가
		// 예치일수가 끝나면 워늠이 얼마 됬는지 출력
		// 원금 : 1000
		// 예치일 : 5
		// 5일후의 원금은 1005원 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원금 : ");
		int one = sc.nextInt(); // 원금
		System.out.print("예치일 : ");
		int day = sc.nextInt(); // 예치일
		
		for(int i = 0; i < day; i++) {
			one++;
		}
		System.out.printf("%d일후의 원금은 %d원 입니다.",day,one);
		
		
		
	}
}
