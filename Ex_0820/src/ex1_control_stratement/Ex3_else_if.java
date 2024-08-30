package ex1_control_stratement;

public class Ex3_else_if {
	public static void main(String[] args) {
		
		// else-if : 여러개의 조건 비교가 필요한 경우 사용하는 제어문
		// if(조건문){}
		// else if (조건문){}
		// else {}
		
		int num = 75;
		String str = "";
		
		if(num >= 90) {
			str = "A";
		}
		else if (num >= 80) {
			str = "B";
		}
		else if (num >= 70) {
			str = "C";
		}
		else if (num >= 60) {
			str = "D";
		}
		else {
			str = "F";
		}
		System.out.println(str);
	}
}
