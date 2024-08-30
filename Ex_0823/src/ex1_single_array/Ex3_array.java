package ex1_single_array;

import java.util.Scanner;

public class Ex3_array {
	public static void main(String[] args) {
		
		// 키보드에서 정수를 입력
		// 입력받은 정수만큼 알파벳을 a부터 순차적으로 출력~
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("값: ");
		int num = sc.nextInt();
		
		char c[] = new char[num];
		char ch = 'A';
		for(int i =0; i < c.length; i++) {
			
			c[i] =ch;
			ch++;
			
			System.out.print(c[i]);
		}
		
	}
}
