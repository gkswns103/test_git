package ex2_multi_array;

public class Ex5_multi_array {
	public static void main(String[] args) {
		
		// 2차원 배열 arr에 담긴 모든값의 총합과 평균을 출력
		
		int sum = 0;
		int cnt = 0;
		int arr[][] = {{5,17,2,1},{11,6},{9,15,20},{13,21,30}};
		for(int i =0; i < arr.length; i++) {
			for(int j =0; j <arr[i].length; j++) {
				sum += arr[i][j];
				cnt++;
			}
		}
		System.out.printf("총 합 : %d \n평균 : %.1f",sum,(float)sum/cnt);
	}
}