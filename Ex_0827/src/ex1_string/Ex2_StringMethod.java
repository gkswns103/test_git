package ex1_string;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		
		// String class 메서드(함수) 들
		// 메서드란 어떤 작업을 수행하기 위한 명령문들의 집합
		// 반복적으로 사용되는 코드를 줄이기 위해서 반드시 필요
		String name = "Hong Gil Dong";
		int index = name.length();
		System.out.println(index);
		
		
		index = name.indexOf('g'); // 앞에서 몇번째 있는지 알려주는 메소드 => indexOf
		System.out.println(index);
		index = name.indexOf("Gil"); // 문장이 시작하는 위치
		System.out.println(index);
		index = name.lastIndexOf('g');
		System.out.println(index);
		
		char c = name.charAt(2); // 문장에서 숫자위치의 한글자를 가지고옴
		System.out.println(c);
		
		String s = name.substring(5); // 문장에서 숫자위치부터 끝까지 가지고옴
		System.out.println(s);
		
		s = name.substring(5,10); // 문장에서 5 ~ 10 까지 추출
		System.out.println(s);
		
		String fruit = "apple";
		if(fruit.equalsIgnoreCase("Apple")) { // equals 는 대문자를 구별함
			System.out.println("값이 같다");	  // equalsIgnoreCase 는 대문자 구별안함
		}
		else {
			System.out.println("값이 다르다");
		}
		
		String id = " abc123 ";
		String id_check = id.trim(); // trime()메소드 => 앞뒤의 의미없는 공백을 제거(중간 공백은 제거 불가능)
		if(id_check.equals("abc123")) {
			System.out.println("로그인 성공");
		}
		
		String number = "10";
		int number2 = Integer.parseInt(number) + 10; // 정수형태의 문자열을 연산이 가능한 실제 정수로 바꿔주는 메서드
		System.out.println(number2);	
		
		// java에서 boolean,int 등의 기본자료형을 쓸수 있게 해주는
		// 부모타입의 클래스를 Wrapper클래스라고 부름
		// boolean -> Boolean
		// char -> Character
		// int -> Integer
		// byte -> Byte
		// short -> Short
		// long -> Long
		// float -> Float
		// double -> Double
	}
}
