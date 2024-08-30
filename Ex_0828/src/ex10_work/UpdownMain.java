package ex10_work;

import java.util.Random;
import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random() ;
		int random = r.nextInt(50) + 1;
		Updown ud = new Updown();
		System.out.println("UP&Down게임 만들기");
		System.out.println("---------------");
		int cnt = 0;
		out:while(true) {
			System.out.print("값 : ");
			int num = sc.nextInt();
			cnt++;
			switch(ud.check(random,num)) {
				case "UP":
					System.out.println("UP!!");
					break;
				case "DOWN":
					System.out.println("DOWN");
					break;
				case "SAME":
					System.out.println(cnt + "회만에 정답");
					break out;
			}
		}
	}
}
