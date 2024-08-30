package ex2_scanner;

import java.util.Scanner;

public class Ex2_Scammer2 {
	public static void main(String[] args) {
		
		int a = 5, b = 4;
		
		// 키보드에서 이름과 나이를 입력받고 결과를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		System.out.println(name + "님의 나이는 : " + age + "살 입니다.");
	}
}