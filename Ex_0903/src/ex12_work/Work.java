package ex12_work;

import java.util.Random;
import java.util.Scanner;

public class Work extends Thread{

	int num1 ,num2,num3;
	int cnt=0,s=0;
	boolean b = true;
	Random r = new Random();
	Scanner sc = new Scanner(System.in);

	public void second() {
		while(cnt <= 5) {
			s++;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

	@Override
	public void run() {
		out:while(true) {
			num1 = r.nextInt(100);
			num2 = r.nextInt(100);
			while(true) {
				System.out.print(num1 + "+" + num2 + "= ");
				num3 = sc.nextInt();
				if(num3 == (num1 + num2)) {
					System.out.println("정답");
					cnt++;
					if(cnt >= 5 ) {
						System.out.println("결과: " + s + "초");
						break out;
					}
					continue out;
				}
				else {
					System.out.println("오답");
					continue;
				}
			}
		}
	}

}
