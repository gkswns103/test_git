package ex6_text_field;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_TextField {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(500,200,300,500);
		
		//입력상자와 버튼을 묶어서 가지고 다니기 위한 객체
		Panel p = new Panel();
		p.setBounds(10,50,280,30);
		p.setBackground(Color.GREEN);
		
		TextField tf = new TextField(15);
		
		Button btn = new Button("ok");
		
		btn.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(tf.getText());
			}
		} );
		
		p.add(tf); //입력상자는 panel에 추가
		p.add(btn); //버튼도 apnel에 추가
		f.add(p);
		
		f.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		} );
		
		f.setVisible(true);
	}
}
