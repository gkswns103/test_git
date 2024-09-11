package ex6_arraylist;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();
		
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(22);
		
		Person p2 = new Person();
		p2.setName("김길동");
		p2.setAge(30);
		
		list.add(p1);
		list.add(p2);
		
		
		
		for( int i=0; i<list.size(); i++ ) {
			
			System.out.println("이름 : " + list.get(i).getName());
			System.out.println("나이 : " + list.get(i).getAge());
			System.out.println("-------------------");
			
		}
	}
	
}
