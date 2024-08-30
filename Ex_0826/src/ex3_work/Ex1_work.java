package ex3_work;

public class Ex1_work {
	public static void main(String[] args) {
		
		int arr[][] = new int[4][4];
		// 2차원 배열 arr에 값을 담고 출력하시오
		// -------------------------
		// 결과 
		// 0 1 2 3
		// 1 2 3 4
		// 2 3 4 5
		// 3 4 5 6
		for(int i =0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j ++) {
				arr[i][j] = i + j;
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
