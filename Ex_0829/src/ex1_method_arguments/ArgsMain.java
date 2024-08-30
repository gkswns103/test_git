package ex1_method_arguments;

public class ArgsMain {
	public static void main(String[] args) {
		
		int arr[] = {10,11,12};
		String str = "홍길동";
		ArgsTest at = new ArgsTest();
		at.test1(arr);
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n---------------");
		at.test2(str);
		System.out.println("str : " + str);
	}
}
