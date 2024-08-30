package ex1_single_array;

public class Ex4_array {
	public static void main(String[] args) {
		
		int[] arr = {15, 7, 20, 3, 17};
		int sum=0;
		for(int i =0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
 	}
}
