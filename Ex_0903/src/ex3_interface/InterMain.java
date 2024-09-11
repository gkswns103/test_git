package ex3_interface;

public class InterMain {

	public static void main(String[] args) {
		// 인터페이스도 자식을 통해서 부모가 함께 객체화 된다
		InterChild ic = new InterChild();
		
		// 인터페이스 역시 추상과 마찬가지로
		// 구현능력이 없어 , 직접적인 메모리 할당이 불가하다.
		InterParent ip = new InterParent() {
			
			@Override
			public int getVALUE() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}
	
}
