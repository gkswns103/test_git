package ex1_string;

import java.util.Scanner;

public class Ex7_string {
	public static void main(String[] args) {
		
		// 입력 : aabbab
		// 출력 : a2b2a1b1
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = sc.next();
		
		String result = "";
		int count = 1;
		
		for(int i =1; i < input.length(); i++) {
			if( input.charAt(i) == input.charAt(i-1)) {
				count++;
			}
			else {
				result += input.charAt(i-1);
				result += count;
				count = 1;
			}
		}
		// 마지막문자 처리
		result += input.charAt(input.length()-1);
		result += count;
		System.out.print(result);
	}
}
