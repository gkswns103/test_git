package ex9_thread;

public class ThreadMain {
public static void main(String[] args) {
	
	MyThread mt = new MyThread();
	mt.start();
	
	for( int i=0; i<10; i++ ) {
		System.out.println("메인스레드 " + i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
