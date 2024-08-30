package ex2_value_type;

public class Ex1_valueType {

	public static void main(String[] args) {
		
		/*
		 기본자료형
		 1. 논리형 : boolean
		 2. 문자형 : char
		 3. 정수형 : byte 1byte (-128 ~ 127)
		 		   short 2byte (-32768 ~ 32767)
		 		   int 4byte (-21억 ~ 21억)
		 		   long 8byte (드럽게 많음)
		 4. 실수형 : float 4.x byte
		 			double 8.x byte
		 */
		
		/* 변수 : 자료형과 함께 사용하며 값을 저장하는 공간
		   변수명 작성 규칙
		   1. 숫자로 시작할 수 없다.
		   2. _를 제외하고 특수문자를 사용할 수 없다.
		   3. 한글 사용하지 않는다.
		   4. 변수의 첫글자는 반드시 소문자로 작성한다.
		*/
		
		// 논리형
		// 논리형은 true. false 중 하나의 값 만을 저장 할 수 있다.
		boolean b1;
		b1 = true;
		if (b1 == true) {
			System.out.println("true 임");
		}
		else {
			System.out.println("false 임");
		}
		
		//문자형 : 홀따옴표 안에 딱 한글자만 저장할 수 있는 자료형
		char ch1 = 'A';
		System.out.println("ch : " + ch1); 
		
		ch1 = 65 + 1;
		System.out.println(ch1);
		
		//정수형 : 소수점 없는 숫자
		byte b = 127;
		int n = 220000000;
		long l = 10000000000L;
		long l2 = 100;
		System.out.println(b + " " + n + " " + l);
		
		//실수형 : 소수점을 가지고 있는 값을 저장하는 자료형
		float f = 3.14f;
		double d = 3.14159;
		System.out.println(f + " " + d);
		
	}
	
}
