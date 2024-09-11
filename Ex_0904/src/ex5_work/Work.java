package ex5_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Work extends Thread{

	String str[] = {"apple","strawberry","banana"};
	List<String> list = new ArrayList<String>();
	Random r = new Random();

	@Override
	public void run() { // 3초마다 새로운 단어 생성
		while(true) {
			try {
				list.add(str[r.nextInt(str.length)]);
				Thread.sleep(3000);
			} catch (Exception e) {
			}
		}
	}

	public void gameStart() {
		start();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(list);
			System.out.print(">> ");
			String str = sc.next();
			if(list.get(0).equals(str)) {
				list.remove(0);
				if(list.size() == 0) {
					System.out.println("클리어!!");
					break;
				}
			}
		}
	}
}
