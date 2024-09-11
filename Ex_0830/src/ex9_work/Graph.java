package ex9_work;

import java.util.Random;

public class Graph {
	int arr[] = new int[100];
	Random r = new Random();

	public Graph() {
		// 생성자 : 100개 난수 발생~
		for( int i =0; i < arr.length; i++ ) {
			arr[i] = r.nextInt(10) + 0;
		}
	}

	public void check() {

		for(int i =0; i < 10; i++) {
			int cnt =0;
			for(int j =0; j < arr.length; j++) {
				if(i == arr[j]) {
					cnt++;
				}
			}
			System.out.print(i + "의 갯수 : " + cnt + " ");
			for(int k=0; k < cnt; k++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
