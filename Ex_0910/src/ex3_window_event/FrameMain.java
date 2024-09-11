package ex3_window_event;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setSize(200,200);
		f.setLocation(500,100);
		
		f.addWindowListener(new ClosingEvent());
		
		f.setVisible(true);
	}
}
