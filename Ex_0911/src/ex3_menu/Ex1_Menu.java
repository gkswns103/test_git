package ex3_menu;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Menu {
	static String s;
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 200, 300, 500);
		
		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("File");
		MenuItem miNew = new MenuItem("new");
		MenuItem miOpen = new MenuItem("open");
		MenuItem miSave = new MenuItem("save");
		
		Menu mWindow = new Menu("Window");
		MenuItem miWin = new MenuItem("new window");
		Menu mEditor = new Menu("editor");
		MenuItem miToggle = new MenuItem("Toggle");
		MenuItem miClone = new MenuItem("Clon");
		
		mEditor.add(miToggle);
		mEditor.add(miClone);
		
		mWindow.add(miWin);
		mWindow.add(mEditor);
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		
		mb.add(mFile);
		mb.add(mWindow);
		
		f.setMenuBar(mb);
		
		miWin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("new window menu click!");
			}
		});
		
		miToggle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("토글메뉴 클릭함");
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
