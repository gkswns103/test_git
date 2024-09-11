package work;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
	static int n[];
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(500,300,500,500);
		
		Panel p = new Panel();
		p.setBounds(20,50,450,30);
		
		Label num = new Label("정수 :");
		TextField tf = new TextField(20);
		
		Button btn = new Button("OK");
		
		btn.addActionListener( new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Money mon = new Money();
				n = mon.mm(tf.getText());
	            f.validate();  // 프레임 강제 갱신
			}
		} );
		
		p.add(num);
		p.add(tf);
		p.add(btn);
		f.add(p);
		
		// print.setBounds(100, 130,300,300);
		Label la1 = new Label("500원 - " +  n[0]);
		la1.setBounds(100, 130, 100, 50);
	
		f.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		} );
		
		f.setVisible(true);
	}
}
