package ex2_while;

import java.util.Random;

public class Ex4_do_while {
	public static void main(String[] args) {
		
		/* 
		 java, jsp, spring의 시험을 봤다.
		 각 과몰별 점수는 랜덤으로 0 ~ 130점이 대입되도록한다
		 과목별 점수 검사 로직은 do~while로 작성
		 한과목이라도 100점을 넘어가면 0 ~ 100사이의 값이 나올때까지 재실행
		 * */
		
		int min = 0, between = 131;
		int java, jsp, spring;
		
		
		do {
			java = new Random().nextInt(between)+min;
			jsp = new Random().nextInt(between)+min;
			spring = new Random().nextInt(between)+min;
			
		}while(java > 100 || jsp > 100 || spring > 100);
		
		System.out.println("java :" + java);
		System.out.println("jsp :" + jsp);		
		System.out.println("springs :" + spring);
	}
}
