package ex2_scanner;

import java.util.Scanner;

public class Ex3_Scanner3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  // 클래스 객체 = new 클래스(생성자)
		System.out.print("출력할 달 : ");
		int month = sc.nextInt();
		switch(month) {
		case 1: case 3:
		case 5: case 7:
		case 8: case 10: case 12:
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 2:
			System.out.println(month + "월은28일까지 있습니다.");
			break;
		case 4: case 6:
		case 9: case 11:
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
		default:
			System.out.println(month + "월은 없습니다.");
			break;

		}
	}
}
