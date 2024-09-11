package ex10_work;

import java.util.Random;
import java.util.Scanner;

public class Scramble {

	private String answer; // 정답
	private String shake; // 정답을 섞은 문제

	public Scramble(String strArr[]) {
		shake = " ";
		int idx = new Random().nextInt(strArr.length);
		answer = strArr[idx];
	}

	public String getAnswer() {
		return answer;
	}

	public String scrambledWord() {

		int inArr[] = new int[answer.length()];

		// inArr배열에 중복되지 않는 난수를 발생
		outer:for(int i = 0; i < inArr.length;) {
			inArr[i] = new Random().nextInt(answer.length());

			for(int j =0; j < i; j++) {
				if(inArr[i] == inArr[j]) {
					continue outer;
				}
			}
			shake += answer.charAt(inArr[i]);
			i++;
		}
		return shake;
	}
}



//		Random r = new Random();
//	Scanner sc = new Scanner(System.in);
//	
//	
//	public void game(String s[]) {
//			int num = r.nextInt(s.length) + 0 ;
//			char c[] = new char[s[num].length()];
//			int b = 0;
//			int b1 = 0;
//			w:while(b < s[num].length()) {
//				int a = r.nextInt(s[num].length()) + 0;
//				
//				for(int i = 0; i < c.length; i++) {
//					if(s[num].charAt(a) == c[i]) {
//						continue w;
//					}
//				}
//				c[b1++] = s[num].charAt(a);	
//				b++;
//			}
//			System.out.print("문제 : ");
//			for(int i =0; i < c.length; i++) {
//				System.out.print(c[i]);
//			}
//			System.out.println();
//			for(int i =0; i < s[num].length(); i++) {
//				System.out.print(">>");
//				String str = sc.next();
//				if(str.charAt(i) != s[num].charAt(i)) {
//					System.out.println("오답입니다.");
//					continue;
//				}
//				else {
//					System.out.println("정답입니다.");
//					break;
//				}
//			}
//	}
//}