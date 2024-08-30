package ex5_work;

public class Ex2_work {
	public static void main(String[] args) {
		
		/*
		 02 x 01 = 02	03 x 01 = 03	04 x 01 = 04 .......
		 02 x 02 = 04
		 .
		 .
		 .
		 .
		 .
		 .
		 */
		
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.printf("%02d x %02d = %02d\t",j,i,i*j);
			}
			System.out.println();
		}
	}
}
