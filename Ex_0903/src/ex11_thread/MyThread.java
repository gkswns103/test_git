package ex11_thread;

public class MyThread extends Thread{

	int num;
	
	public MyThread(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println(this.num--);
		try {
			Thread.sleep(1000);
		}
		catch (Exception e) {

		}
		if(num == 0) {
			break;
		}
		}
	}
}
