package ex1_control_stratement;

public class Ex4_switch {
	public static void main(String[] args) {
		
		// if 문과 유사하게 생겼지만 switch문은 ()안에
		// 조건식이 아닌 비교값이 들어가며 비교값과 조건값을 비교하는 구조
		
		
		// 1. 비교값과 조건값의 타입은 반드시 일치해야 한다
		// 2. 조건값이 중복되어서는 안된다
		int n = 1;
		switch(n) {
		case 1:
			System.out.println("1.게임하기");
			break;
		case 2:
			System.out.println("2.게임설명");
			break;
		case 3:
			System.out.println("3.제작자");
			break;
		default:
			//비교값과 조건값이 하나도 일치하지 않을때 수행되는 영역
			System.out.println("올바른 메뉴를 선택하세요");
			break;
			
		}
		
	}
}
