package ex3_multi_for;

public class Ex1_multiFor {
	public static void main(String[] args) {
		
		// 다중for문 : for문안에 for문이있는경우
		
		for(int i = 3; i >= 1; i--) {
			for(int j = 3; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}
		
	}
}
