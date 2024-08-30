package ex5_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

		// 정수 두개 입력받아 입력받은 두 수의 최소 공배수 구하기
		// 출력
		// 수1 : 
		// 수2 : 
		// 최소 공배수 : ~~

		Scanner sc = new Scanner(System.in);
		System.out.print("수1 :");
		int n1 = sc.nextInt();
		System.out.print("수2 :");
		int n2 =  sc.nextInt();
		int n1_b = n1, n2_b =n2;

		if( n1 == n2) {
			System.out.println("최소 공배수 : " + n1);
		}
		else {
			while(true) {
				if(n1 < n2) {
					n1_b +=n1;
					if(n1_b % n2 == 0) {
						System.out.println("최소 공배수 : " + n1_b);
						break;
					}
				}
				else if(n1 > n2) {
						n2_b +=n2;
						if(n2_b % n1 == 0) {
							System.out.println("최소 공배수 : " + n1_b);
							break;
						}
				}
			}

		}
	}
}
