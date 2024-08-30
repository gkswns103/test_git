package ex1_random;

import java.util.Random;

public class Ex1_random {
	public static void main(String[] args) {
		
		// 1 ~ 5 사이의 난수 발생
		// new Random().nextInt(난수범위)+시작수;
		
		int n1 = new Random().nextInt(5)+1;
		System.out.println(n1);
		
		// 1024 ~ 33152 사이의 난수
		// new Random().nextInt(끝수 - 시작수 + 1)+시작수;
		int n2 = new Random().nextInt(33152-1023)+1024;
		System.out.println(n2);
		
		System.out.println("---------------------------");
		
		// 2 ~ 9 사이의 난수를 발생시켜 구구단 출력
		int gugu = new Random().nextInt(9-2+1) + 2;
		for(int i = 1; i < 10; i++)
			System.out.printf("%d ",gugu * i);
	}
}
