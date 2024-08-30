package ex3_multi_for;

public class Ex5_multiFor {
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i % 2 != 0)
					System.out.printf("%d ",j);
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
