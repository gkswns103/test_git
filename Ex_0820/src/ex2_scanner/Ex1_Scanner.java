package ex2_scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		System.out.println(num);
		
		System.out.println("문자열 : ");
		String str = sc.next();
		System.out.println(str);
	}
}
