package ex3_break;

import java.util.Scanner;

public class Ex5_break {
	public static void main(String[] args) {
		
		// 정수 2개 입력받아 두수의 최대 공약수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수1: ");
		int su1 = sc.nextInt();
		System.out.print("수2: ");		
		int su2 = sc.nextInt();
		
		if(su1 > su2) {
			int su3 = su1;
			su1 = su2;
			su2 = su3;
		}
		int i = su1;
		
		for(; i >= 1; i--) {		
			if(su1 % i ==0 && su2 % i == 0) {
				break;
			}
			
		}
		
		if(i == 1)
			System.out.println("최대 공약수가없습니다.");
		else
			System.out.println("최대 공약수 : " + i);
	}
}
