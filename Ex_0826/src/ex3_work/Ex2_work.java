package ex3_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {

		// 키보드에서 입력받은 값 크기의 홀수 마방진 만들기
		// ----------
		// 08 01 06
		// 03 05 07
		// 04 09 02

		// 위 오른쪽 다음숫자 이미 있으면 아래
		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		int num = sc.nextInt();
		int arr[][] = new int[num][num];
		int n = 1;
		int i =0 , j =num/2; // 시작위치
		arr[i][j] = n; // 시작 값
		while(n < num*num) {
			int back_i = i, back_j=j; // 변경전 위치
			--i; ++j;	// 위로 한칸 오른쪽 한칸 이동
			// 위로 나가는경우
			if(i < 0) {
				i = num-1;
			}
			// 오른쪽으로 나가는경우
			if(j >= num) {
				j = 0;
			}
			// 이동한곳에 데이터가 없는 경우
			if(arr[i][j] == 0) {
				arr[i][j] = ++n;
			}
			// 이동한 곳에 데이터가 있는경우
			else if(arr[i][j] != 0) {
				i = back_i;	// 변경전 위치로 다시 이동
				j = back_j;	// 변경전 위치로 다시 이동
				++i;
				if(i >= num) {
					i = 0;
				}
				arr[i][j] = ++n;
			}
		}
		for(int l =0; l < arr.length; l++) {
			for(int k =0; k < arr[l].length; k ++) {
				System.out.printf("%02d ",arr[l][k]);
			}
			System.out.println();
		}
	}
}
