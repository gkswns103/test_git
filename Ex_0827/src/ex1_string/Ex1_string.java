package ex1_string;

public class Ex1_string {
	public static void main(String[] args) {
		
		// String 클래스의 특징
		// 1) 객체 생성 방법이 두 가지(암시적,명시적)
		// 2) 한 번 생성된 문자열의 내용은 변하지 않는다(불변의 특징)
		
		String s1 = "abc";
		String s2 = "abc"; // 암시적 객체생성
		String s3 = new String("abc"); // 명시적 객체생성
		
		
		// new 로만드는 클래스는 명시적
		// == 객체간 비교에서는 값이 아닌 주소 비교 연산자
		if(s1 == s3) {
			System.out.println("주소가 같습니다");
		}
		else {
			System.out.println("주소가 다릅니다");
		}

		
		if( s1.equals(s3)) {
			System.out.println("값이 같습니다");	
		}
		else {
			System.out.println("값이 다릅니다");
		}
		
		
		
	}
}
