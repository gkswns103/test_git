package ex8_method_work;

import java.util.Scanner;

public class PalMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("값: ");
		String str = sc.next();
		//키보드에서 입력받은 원본 문장을 뒤집어서 저장
		Palindrome p = new Palindrome();
		//입력받은 값이 회문인지 아닌지 판단
		if(str.equals(p.rotate(str))) {
			System.out.print("회문입니다.");
		}
		else {
			System.out.print("회문이 아닙니다.");
		}
	}
}
