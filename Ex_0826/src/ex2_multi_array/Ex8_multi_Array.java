package ex2_multi_array;

import java.util.Scanner;

public class Ex8_multi_Array {
	public static void main(String[] args) {
		
		// 키보드에서 입력받은 값보다 큰 첫번째 값을 찾아 출력
		// 찾아낸 값이 포함된 해을 모두 출력
		int array[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색 : ");
		int num = sc.nextInt();
		out:for(int i =0; i < array.length; i++) {
			for(int j =0; j < array[i].length; j++) {
				if (num < array[i][j]) {
					System.out.printf("%d보다 큰 첫번째 수 : %d\n",num,array[i][j]);
					for(j = 0; j < array[i].length; j++) {
						System.out.printf("%d ",array[i][j]);
					}
					break out;
				}
				
			}
		}
		
	}
}
