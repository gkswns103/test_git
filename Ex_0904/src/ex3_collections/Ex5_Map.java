package ex3_collections;

import java.util.HashMap;
import java.util.Scanner;

public class Ex5_Map {
	public static void main(String[] args) {

		// id : aaa
		// pw : 1111
		// 아이디가 존재하지 않습니다

		// id : lee
		// pw : 3333
		// 비밀번호가 일치하지 않습니다

		// id : kim
		// pw : 1111
		// 로그인 성공
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		map.put("kim",1111);
		map.put("lee",2222);
		map.put("park",3333);
		
		Scanner sc = new Scanner(System.in);
		String id;
		int pw;
		while(true) {
			System.out.print("id :");
			id = sc.next();
			System.out.print("pw :");
			pw = sc.nextInt();
			if( map.containsKey(id) ) { //
				if(map.get(id) == pw) {
					System.out.println("로그인 성공");
					break;
				}
				else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					continue;
				}
			}
			else {
				System.out.println("아이디가 존재하지 않습니다.");
				continue;
			}
		}
	}
}
