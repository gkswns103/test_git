package ex8_work;

import java.util.Scanner;

public class WorkMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = sc.next();
		Work work = new Work();
		work.printOdd(input);
		
	}
}
