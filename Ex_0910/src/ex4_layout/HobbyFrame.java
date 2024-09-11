package ex4_layout;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HobbyFrame {
	
	// int... <-- variable arguments
	// 외부에서 전달받은 인자의 갯수만큼 배열을 생성해주는 기능
	public HobbyFrame(int... data) {
		
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(500, 100,500, 300);
		
		Label text = new Label("당신의 취미");
		text.setBounds(10,30,150,30);
		f.add(text);
		
		//결과 저장 변수
		String res = "";
		
		if( data[0] == 1 )
			res += "뉴스 ";
		if( data[1] == 1)
			res += "운동 ";
		if( data[2] == 1)
			res += "영화 ";
		if( data[3] == 1)
			res += "음악 ";
		
		Label text2 = new Label(res);
		text2.setBounds(50,100,300,30);
		f.add(text2);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		f.setVisible(true);
		
	}
}
