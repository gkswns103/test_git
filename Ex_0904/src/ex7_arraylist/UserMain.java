package ex7_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		
		// id: aaa
		// pw: 1111
		// aaa / 1111
		// -----------
		// id: bbb
		// pw: 2222
		// aaa / 1111
		// bbb / 2222
		
		Scanner sc = new Scanner(System.in);
		List<User> list = new ArrayList<User>();
		a:while(true) {
			User u = new User();
			System.out.print("id: ");
			u.setId(sc.next());
			System.out.print("pw: ");
			u.setPw(sc.nextInt());
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getId().equals(u.getId())) {
					System.out.println("중복된 아이디");
					continue a;
				}
			}
			list.add(u);
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i).getId() + " / " + list.get(i).getPw());
			}
			System.out.println("----------------");
		}
		
	}
}
