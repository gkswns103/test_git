package ex1_choice;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Choice {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(400, 100, 500, 250);
		
		Choice day = new Choice();
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");
		
		day.setSize(150,0);
		day.setLocation(50,100);
		
		Font font = new Font("",Font.ITALIC,30);
		
		day.setFont(font);
		// choice객체에 이벤트 감지자 추가
		day.addItemListener( new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String s = day.getSelectedItem();
				System.out.println(s);
			}
		} );
		
		f.add(day);
		
		
		f.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		} );
		
		
		f.setVisible(true);
	}
}
