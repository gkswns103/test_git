package ex7_work;

import java.util.Scanner;

public class Work1 {
	
	// 입력 : aabbcca
	// 출력 : abc
	// 한번씩만 출력
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = sc.next();
		Exwork ew = new Exwork();
		ew.getResult(input);
	}
}
