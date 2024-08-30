package ex2_multi_array;

public class Ex6_multi_array {
	
	public static void main(String[] args) {
		
		int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int num =0;
		out:for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] > 5) {
					num = array[i][j];
					break out;
				}
			}
		}
		System.out.println("결과 : " + num);
	}
}