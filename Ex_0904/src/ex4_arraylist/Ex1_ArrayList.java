package ex4_arraylist;

import java.util.ArrayList;

public class Ex1_ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(20);

		// 1번 index의 값을 30으로 수정
		list.set(1,30);
		list.remove(2);

		// 1번 index에 20을 추가
		list.add(1, 20);
		
		System.out.println(list.size());
		System.out.println(list);

		// 전부 삭제
		//list.clear();

		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
