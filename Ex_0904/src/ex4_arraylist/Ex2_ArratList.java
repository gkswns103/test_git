package ex4_arraylist;

import java.util.ArrayList;

public class Ex2_ArratList {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("장비");
		list.add("전위");
		list.add("동탁");
		System.out.println(list);
		
		list.set(0,"유비");
		list.set(1,"관우");
		list.set(2,"장비");
		list.add("조조");
		list.add("동탁");
		list.add("여포");
		System.out.println(list);
	}
}
