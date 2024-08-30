package ex1_single_array;

public class Ex1_array {
	public static void main(String[] args) {
		
		
		// 배열의 선언, 생성, 초기화를 한번에
		// int arr[] = {10,20,30,40,50}
		
		// 초기화
		// 정수-0, 문자-'', 문자열-null, 실수-0.0 으로 초기화가 된다.
		
		int[] arr;
		arr = new int[4];
		int x = 100;
		for(int i =0; i < arr.length; i++) {
			arr[i] = x;
			x+= 100;
			
			System.out.println(arr[i]);
		}
		
		
		int arr2[] = {100,200,300};
		for(int i =0; i < arr2.length; i++)
			System.out.println(arr2[i]);
	}
}
