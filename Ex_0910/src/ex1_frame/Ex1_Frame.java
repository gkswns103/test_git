package ex1_frame;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_Frame {

	public static void main(String[] args) {
		
		Frame frame = new Frame("나의 첫 프레임");
		frame.setSize(400,300); // 창의 크기
		frame.setLocation(500,100); //위치
		frame.setBackground( Color.blue);
		// 현재 프레임을 화면에 띄워주는 메서드
		frame.setVisible(true);
	}
	
}
