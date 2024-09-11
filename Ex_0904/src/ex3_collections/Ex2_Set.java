package ex3_collections;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex2_Set {

	public static void main(String[] args) {

		// HashSet을 이용하여 중복되지 않는 6개의 난수를 출력하는
		// 로또번호 생성기 만들기
		Random r = new Random();
		HashSet<Integer> hs = new HashSet<Integer>();
		while(true) {
			hs.add(r.nextInt(45) + 1);
			if(hs.size() >=6) {
				break;
			}
		}
		System.out.println(hs);
		
		System.out.println("-----------------------");
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		while( ts.size() < 6) {
			ts.add(r.nextInt(45) + 1);
		}
		System.out.println(ts);
		
		TreeSet<String> names = new TreeSet<String>();
		names.add("강하늘");
		names.add("john");
		names.add("adam");
		names.add("가길동");
		System.out.println("-----------------------");
		System.out.println(names);
	}
}
