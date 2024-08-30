package ex4_work;

public class Ex2_work {
	public static void main(String[] args) {
		
		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 1
		// 3
		// 4
		// 5
		for(int i = 0; i < 10; i++) {
			for(int j =1; j <= 10; j++) {
				if((i+j)>10)
					System.out.printf("%d ",i+j-10);
				else
					System.out.printf("%d ",i+j);
			}
			
			System.out.println();
		}
	}
}
