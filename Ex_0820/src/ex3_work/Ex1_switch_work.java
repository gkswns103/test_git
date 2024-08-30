package ex3_work;

import java.util.Scanner;

public class Ex1_switch_work {
	public static void main(String[] args) {
		
		// 키보드에서 정수 두개와 연산자를 입력 받는다
		// 입력받은 두 정수의 연산 결과를 출력
		
		
		Scanner sc = new Scanner(System.in);
		int num1 ,num2;
		String  str;
		System.out.print("수1 : ");
		num1 = sc.nextInt();
		System.out.print("수2 : ");
		num2 = sc.nextInt();
		System.out.print("연산자 : ");
		str = sc.next();
		
		switch(str) {
		case "+":
			System.out.println("결과 : " + (num1 + num2));
			break;
		case "-":
			System.out.println("결과 : " + (num1 - num2));
			break;
		case "*":
			System.out.println("결과 : " + (num1 * num2));
			break;
		case "/":
			System.out.println("결과 : " + (num1 / num2));
			break;
		default:
			System.out.println("다시");
		}
	}
}
