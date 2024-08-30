package ex1_single_array;

public class Ex3_single_array {
	public static void main(String[] args) {
		
		String arr[] = {"홍길동", "김길순", "박길남"};
		for(int i =0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("----------");
		// 개선된 roof
		// 조건식 증감식이 없어 코드가 간단하지만
		// 배열의 각 요소에 대한 세부적인 조회가 불가능
		for(String s : arr) {
			System.out.println(s);
		}
	}
}
