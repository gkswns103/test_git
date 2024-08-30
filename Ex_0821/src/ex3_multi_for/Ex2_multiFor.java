package ex3_multi_for;

public class Ex2_multiFor {
	public static void main(String[] args) {
		
		// 01 02 03 04
		// 05 06 07 08
		//          12
		
		int num = 0;
		for(int i=1;i<=3; i++) {
			for(int j=1; j<=4;j++) {
				System.out.printf("%02d ",++num);
			}
			System.out.printf("\n");
		}
	}
}
