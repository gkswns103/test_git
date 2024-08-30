package ex8_work;

import java.util.Scanner;

public class Actor {
	
	public void select(String str[][]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배우검색 :");
		String select_actor = sc.next();
		for(int i =0; i < str.length; i++) {
			
			if(str[i][0].equals("[" + select_actor + "]")) { // 이름이 같다면
				
				for(int j =0; j < str[i].length; j++) {
					System.out.println(str[i][j]);
				}
				return ;
			}
		}
		System.out.println("해당배우가 존재하지 않습니다.");
	}
}
