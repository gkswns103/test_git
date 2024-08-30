package ex4_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
		// continue : 반복문 내에서 특정 문장을 건너뛸때 사용하는 키워드
		for(int i = 0; i <= 3; i++) {
			for(int j = 1; j <= 5; j++) {
				
				if(j %2 == 0) {
					continue;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
