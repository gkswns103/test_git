package ex5_anonymous;

import java.util.Random;

public class Ex1_Anony {

	public static void main(String[] args) {
		
		// 이름이 없는 형태로
		// 필요할때만 즉석에서 생성되는 구조를 익명클래스라고 한다
		// 익명클래스는 사용된 직후 메모리에서 알아서 삭제된다
		int n = new Random().nextInt(10);
		
		
		// 이름이 있는 형태로
		// 필요할떄마다 이름을 통해 접근할수 있다는 장점이 있지만
		// 프로그램이 완전히 종료될 떄까지 메모리에서 사라지지 않는다.
		Random rnd = new Random();
		int n2 = rnd.nextInt();
		
	}
	
}
