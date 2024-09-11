package ex4_layout;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonEvent3 {
	public static void main(String[] args) {
		
		Frame f1 = new Frame();
		
		f1.setLayout(null);
		f1.setBounds(300,100,500,500);
		
		f1.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		} );
		
		f1.setVisible(true);
		
		Frame f2 = new Frame();
		
		f2.setLayout(null);
		f2.setBounds(400,200,300,300);
		
		Button btnYes = new Button("YES");
		Button btnNO = new Button("NO");
		
		ActionListener acl = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				switch (e.getActionCommand()) {
				case "YES":
					System.exit(0);
					break;
				case "NO":
					f2.dispose();
					break;

				}
				
			}
		};
		
		btnYes.setBounds(50,150,70,50);
		btnNO.setBounds(180,150,70,50);
		
							// 글꼴,글자스타일,글자크기
		Font font = new Font("",Font.PLAIN,30);
		Label msg = new Label("정말로 종료??");
		msg.setBounds(20,30,200,50);
		msg.setFont(font);
		
		f2.add(btnYes);
		f2.add(btnNO);
		f2.add(msg);
		
		btnYes.addActionListener(acl);
		btnNO.addActionListener(acl);
		
		f2.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		} );
		//만들어진 프레임의 크기 고정
		f2.setResizable(false);
		f2.setVisible(true);
	}
}
