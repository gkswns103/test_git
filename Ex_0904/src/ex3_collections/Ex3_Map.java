package ex3_collections;

import java.util.HashMap;
import java.util.TreeMap;

public class Ex3_Map {

	public static void main(String[] args) {
		
		// Map은 키(key)와 값(value)의 하나의 데이터로 묶어서 저장한다
		// 키를 통해 원하는 값을 검색하므로 많은 양의 데이터를 조회하는데
		// 매우 뛰어난 성능을 발휘한다
		
		// map은 중복된 키값을 허용하지 않는다
		// 키가 중복될 경우 마지막에 추가한 값으로 갱신
		
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		map1.put(1, 100);
		map1.put(2, 200);
		map1.put(5, 300);
		map1.put(3, 400);
		map1.put(5, 500);
		
		map1.remove(3);
		
		System.out.println(map1.size());
		System.out.println(map1);
		
		int res = map1.get(2);
		
		System.out.println(res);
		
		System.out.println("-----------------------------------");
		
		TreeMap<Integer, Integer> tmap1 = new TreeMap<Integer, Integer>();
		tmap1.put(1, 300);
		tmap1.put(2, 200);
		tmap1.put(5, 100);
		tmap1.put(3, 400);
		tmap1.put(5, 500);
		
		System.out.println(tmap1.size());
		System.out.println(tmap1);
	}
	
}
