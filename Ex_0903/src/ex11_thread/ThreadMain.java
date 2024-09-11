package ex11_thread;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {
		
		// 키보드에서 입력받은 숫자가 1씩 감소하다가
		// 0이 되었을 때 스레드를 종료하는 코드를 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int n = sc.nextInt();
		MyThread t = new MyThread(n);
		t.start();
	}
}
