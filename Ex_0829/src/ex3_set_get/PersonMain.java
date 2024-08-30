package ex3_set_get;

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.setName("이한준");
		p.setAge(26);
		p.setRegeon("홍천");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getRegeon());
	}
}
