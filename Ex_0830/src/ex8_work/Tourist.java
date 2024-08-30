package ex8_work;

import java.util.Scanner;

public class Tourist {

	String name[];
	int age[];
	Scanner sc = new Scanner(System.in);
	
	public void tourist(int n) {
		name = new String[n];
		age = new int[n];
		for(int i =0; i < n; i++) {
			System.out.print(i+1 + ".이름: ");
			name[i] = sc.next();
			System.out.print(i+1 + ".나이: ");
			age[i] = sc.nextInt();
		}
		System.out.println("---------------");
	}
	
	public void touristInfo(Guide g1) {
		for(int i = 0; i < name.length; i++) {
			System.out.println(i+1 + ".이름: " + name[i]);
			System.out.println(i+1 + ".나이: " + age[i]);
			System.out.println(i+1 + ".목적지: " + g1.location);
			System.out.println("------------------");
		}
	}
}