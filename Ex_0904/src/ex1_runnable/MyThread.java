package ex1_runnable;

import javax.swing.JFrame;

public class MyThread extends JFrame implements Runnable{

	@Override
	public void run() {
		
		for( int i=0; i<10; i++ ) {
			
			try {
				Thread.sleep(1000);
				System.out.println("스레드 실행 " + i);
			} catch (Exception e) {
			}
			
		}
		
	}
	
}
