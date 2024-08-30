package ex5_method_gugudan;

import java.util.Scanner;

public class GuguMain {
	public static void main(String[] args) {
		
		// 정수 입력후 단에 해당하는 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		int num = sc.nextInt();
		
		GuguDan gu = new GuguDan();
		gu.gugu(num);
	}
}
