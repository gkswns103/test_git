package ex1_choice;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_Choice {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(400, 100, 500, 250);
		
		Choice c = new Choice();
		c.add("서울");
		c.add("인천");
		c.add("경기");
		c.add("강원");
		c.add("대구");
		c.add("대전");
		c.add("부산");
		c.add("충북");
		c.add("충남");
		c.add("제주");
		
		Font font = new Font("",Font.PLAIN,20);
		c.setFont(font);
		c.setSize(150,0);
		c.setLocation(100,50);
		f.add(c);
		Label l = new Label();
		l.setBounds(350,50,100,50);
		c.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				l.setText(c.getSelectedItem());
				f.add(l);
				l.repaint();
			}
		});
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
	}
}
