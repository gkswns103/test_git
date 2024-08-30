package ex7_work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		
		// 입력 : 123
		// 123는 숫자입니가? true
		
		// 입력 : a12
		// a12는 숫자입니가? false
		
		Work work = new Work();
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();
		if(work.chack(str)) {
			System.out.println(str + "은(는) 숫자입니까? " + work.chack(str));
		}
		else {
			System.out.println(str + "은(는) 숫자입니까? " + work.chack(str));
		}
	}
}

