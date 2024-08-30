package ex5_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {

		/*
		 사용자가 현재 가지고 있는 돈을 입력받고
		 크림빵 새우깡 콜라를 잔돈을 하나도 남기지 않고 구입하는
		 경우의 수를 모두 출력하시오.
		 단 구입하지 않는 상품 x
		 크림빵 500원 새우깡 700원 콜라 400원
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("가지고있는 돈: ");
		int money = sc.nextInt(); // 소지한 돈

		int cream = 500;
		int shrimp = 700;
		int coke = 400;
		
		for(int i = 1; money - i*cream > 0; i++) {
			
			for(int j = 1; money - j*shrimp > 0; j++) {
				
				for(int k = 1; money - k*coke > 0; k++) {
					
					if(money == (i*cream) + (j*shrimp) + (k*coke)) {
						System.out.printf("크림빵 : %d 새우깡 : %d 콜라 %d\n",i,j,k);
					}
					
				}
				
			}
			
		}
	}
}
