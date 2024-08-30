package ex8_method_work;

public class Palindrome {

	public String rotate(String s) {
		
		// 원본 문자열을 뒤집어서 저장
		String ss = "";
		for(int i =s.length()-1; i >= 0 ; i--) {
				ss += s.charAt(i);
		}
		return ss;
	}
}
