package ex1_string;

import java.util.Scanner;

public class Ex4_string {
	public static void main(String[] args) {
		
		// 키보드에서 아무 값이나 입력받은 뒤
		// 입력받은 문장에 소문자 a의 객수를 판단하ㅣ오
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		String str = sc.next();
		int cnt =0;
		for(int i =0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				cnt++;
			}
		}
		System.out.printf("a의 갯수 : %d",cnt);
	}
}
