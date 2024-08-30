package ex1_string;

import java.util.Scanner;

public class Ex3_string {
	public static void main(String[] args) {
		
		// 주민번호 입력 : 901122-1234567
		// 당신은 90년 11월 22일에 태어난 남자입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 :");
		String ju = sc.next();
		String str1 = ju.substring(0,2);
		String str2 = ju.substring(2,4);
		String str3 = ju.substring(4,6);
		String str4 = ju.substring(7,8);
		if(Integer.parseInt(str4) == 1 || Integer.parseInt(str4) == 3) {
			System.out.printf("당신은 %s년 %s월 %s일에 태어난 남자입니다.",str1,str2,str3);
		}
		else if(Integer.parseInt(str4) == 2 || Integer.parseInt(str4) == 4){
			System.out.printf("당신은 %s년 %s월 %s일에 태어난 여자입니다.",str1,str2,str3);
		}
	}
}
