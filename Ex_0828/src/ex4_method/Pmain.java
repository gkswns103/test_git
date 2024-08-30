package ex4_method;

import java.util.Scanner;

public class Pmain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		
		Preson p = new Preson();
		System.out.println(p.info(name, age));
	}
}
