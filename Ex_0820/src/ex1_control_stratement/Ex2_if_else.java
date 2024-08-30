package ex1_control_stratement;

public class Ex2_if_else {
	public static void main(String[] args) {
		
		int n = 50;
		String ss = "";
		
		if (n++ >= 50) {
			ss = "50이상의 수";
		}
		else {
			ss = "50미만의 수";
		}
		
		System.out.println(ss);
		
		//변수 age에 나이를 대입하고 20세 이상이면
		//드실만큼 드셨군요 그렇지 않으면 조금 더 드셔도 됙ㅆ어요 를
		// 출력 작성
		int age = 26;
		if(age >= 20) {
			System.out.println("드실만큼 드셨군요");
		}
		else {
			System.out.println("조금 더 드셔도 될듯");
		}
		
		String str = age >= 20 ? "드실만큼 드셨군요" : "조금 더 드셔도 될듯";
		System.out.println(str);
	}
}
