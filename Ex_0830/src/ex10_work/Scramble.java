package ex10_work;

import java.util.Random;
import java.util.Scanner;

public class Work {
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	
	public void game(String s[]) {
			int num = r.nextInt(s.length) + 0 ;
			char c[] = new char[s[num].length()];
			int b = 0;
			int b1 = 0;
			w:while(b < s[num].length()) {
				int a = r.nextInt(s[num].length()) + 0;
				
				for(int i = 0; i < c.length; i++) {
					if(s[num].charAt(a) == c[i]) {
						continue w;
					}
				}
				c[b1++] = s[num].charAt(a);	
				b++;
			}
			System.out.print("문제 : ");
			for(int i =0; i < c.length; i++) {
				System.out.print(c[i]);
			}
			System.out.println();
			for(int i =0; i < s[num].length(); i++) {
				System.out.print(">>");
				String str = sc.next();
				if(str.charAt(i) != s[num].charAt(i)) {
					System.out.println("오답입니다.");
					continue;
				}
				else {
					System.out.println("정답입니다.");
					break;
				}
			}
	}
}