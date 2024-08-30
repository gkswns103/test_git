package ex6_method_calculator;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 :");
		int su1 = sc.nextInt();
		System.out.print("수2 :");
		int su2 = sc.nextInt();
		System.out.print("연산자 :");
		char c = sc.next().charAt(0);
		
		CalPrint cal = new CalPrint();
		cal.printResult(su1,su2,c);
		
	}
}
