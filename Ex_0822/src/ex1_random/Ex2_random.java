package ex1_random;

import java.util.Random;

public class Ex2_random {
	public static void main(String[] args) {
		
		// 랜덤클래스를 이용하여 대문자 A~ z사이의 값중 하나를 랜덤으로 출력 ㄱ
		
		int rand = new Random().nextInt('Z' - 'A' + 1) + 'A';
		System.out.printf("%c",rand);
	}
}
