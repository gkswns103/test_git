package ex1_method_arguments;

public class ArgsTest {

	public void test2(String s) {
		s += "hi";
		System.out.println("s : " + s);
	}
	
	public void test1(int a[]) {
		// 배열과 같은 객체는
		// 파라미터로 전달 될 때 복사본이 아닌 원본의 주소값이 그대로 전달되기 때문에
		// 현재 메서드에서 a값을 수정하면 원본 arr의 값도 함께 수정된다.
		a[0] = 100;
		for(int i =0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("-------------");
	}
}
