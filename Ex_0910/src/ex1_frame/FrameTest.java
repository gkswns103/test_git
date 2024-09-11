package ex1_frame;

import java.awt.Color;


public class FrameTest {
	public static void main(String[] args) {	
		
		MyFrame fr1 = new MyFrame("1번");
		fr1.setBackground(Color.YELLOW);
		
		MyFrame fr2 = new MyFrame("2번");
		fr2.setBackground(Color.GREEN);
	}
}
