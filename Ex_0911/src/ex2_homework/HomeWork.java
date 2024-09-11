package ex2_homework;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HomeWork {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(500,200,300,500);
		
		TextField tf = new TextField(15);
		tf.setBounds(10,40,200,30);
		
		Button btn = new Button("OK");
		btn.setBounds(220,40,30, 20);
		
		Label lab1 = new Label();
		lab1.setBounds(50, 100, 200, 20);
		
		Label lab2 = new Label();
		lab2.setBounds(50, 130, 200, 20);
		
		Label lab3 = new Label();
		lab3.setBounds(50, 160, 200, 20);
		
		Label lab4 = new Label();
		lab4.setBounds(50, 190, 200, 20);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int coin[] = {500,100,50,10};
				
				int money = Integer.parseInt(tf.getText());
				
				for(int i=0; i <coin.length; i++) {
					int res = money /coin[i];
					
					if( i == 0) 
						lab1.setText(coin[i] + "원 - " + res);
					else if( i == 1) 
						lab2.setText(coin[i] + "원 - " + res);
					else if( i == 2) 
						lab3.setText(coin[i] + "원 - " + res);
					else if( i == 3) 
						lab4.setText(coin[i] + "원 - " + res);
					
					money %= coin[i];
				}
			}
		});
		
		f.add(tf);
		f.add(btn);
		f.add(lab1);
		f.add(lab2);
		f.add(lab3);
		f.add(lab4);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		f.setVisible(true);
	}
}
