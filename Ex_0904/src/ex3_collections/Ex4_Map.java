package ex3_collections;

import java.util.HashMap;

public class Ex4_Map {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("k1",100);
		hm.put("k1",200);
		hm.put("k2",100);
		hm.put("k3",300);
		
		if(hm.containsKey("k1")) {
			System.out.println(hm.get("k1"));
		}
		
		if(hm.containsValue(200)) {
			System.out.println("hm은 200을 가지고 있다");
		}
		
		System.out.println(hm);
	}
}
