package ex4_class_array;

public class PersonMain {
	public static void main(String[] args) {
		
		Person[] p = new Person[2];
		
		// 배열의 각 index별로 물리적인 객체화(메모리 할당) 작업을
		// 반드시! 처리해야 한다.
		p[0] = new Person();
		p[1] = new Person();
		
		p[0].setName("홍길동");
		p[0].setAge(20);
		
		p[1].setName("김길동");
		p[1].setAge(30);
		
		for(int i=0; i < p.length; i++) {
			System.out.printf("%s / %d\n",p[i].getName(),p[i].getAge());
		}
	}
}
