package ex1_single_array;

import java.util.Scanner;

public class Ex2_single_array {
	public static void main(String[] args) {
		
		// 배열에 값을 입력후 저장후 홀수와 짝수의 갯수를 찾아 출력
		// ---------
		// 배열의 크기 : ~~
		// 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int cnt1 = 0, cnt2 = 0;
		
		// arr = {5,6,7,8,9};
		for(int n : arr) {
			if(n % 2 == 0) {
				cnt1++;
			}
			else
				cnt2++;
		}
		
//		for(int i = 0; i < size; i++) {
//			System.out.print("정수 : ");
//			arr[i] = sc.nextInt();
//			
//			if(arr[i] % 2 == 0) {
//				cnt1++;
//			}
//			else {
//				cnt2++;
//			}
//		}
		System.out.println("-----------");
		System.out.printf("홀수 : %d\n짝수 : %d",cnt2,cnt1);
		
	}
}
