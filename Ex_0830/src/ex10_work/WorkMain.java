package ex10_work;

import java.util.Scanner;

public class WorkMain {

	public static void main(String[] args) {

		// 배열 strArr의 값 중 하나를 랜덤으로 가져온다
		// 가져온 값을 무작위로 섞어서 보여주고 정답을 맞히는 코드를 작성
		// ----------
		// 문제 : OPEH
		// >> HOPE
		// 정답입니다!

		String strArr[] = {"CHANGE","HOPE","VIEW","APPLE"};

		Scanner sc = new Scanner(System.in);
		Scramble scrambel = new Scramble(strArr);
		System.out.println("문제 : " + scrambel.scrambledWord());
		while(true) {
			System.out.print(">>");
			String s = sc.next();
			if( s.equalsIgnoreCase(scrambel.getAnswer())) {
				System.out.println("정답입니다");
				break;
			}
			else {
				System.out.println("오답입니다.");
				continue;
			}
		}
	}
}