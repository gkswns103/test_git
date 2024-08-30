package ex1_string;

import java.util.Scanner;

public class Ex5_string {
	public static void main(String[] args) {
		
		// 키보드에서 입력받은 값이 회문인지 판단하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		String str = sc.next();
		int i =0,j=str.length()-1;
		while(true) {
			if(str.charAt(i) == str.charAt(j)) {
				i++; j--;
				if(i < j) {
					System.out.printf("%s는 회문입니다.",str);
					break;
				}
			}
			else {
				System.out.printf("%s는 회문이 아닙니다.",str);
				break;
			}
			
			
		}
	}
}
