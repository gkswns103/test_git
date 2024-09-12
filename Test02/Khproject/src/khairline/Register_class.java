package khairline;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Register_class {

	public Register_class() { // 생성자에서 프레임 설정
		
		
		Frame f_register = new Frame("회원가입");
		f_register.setLayout(null);
		f_register.setBounds(400,200,800,600);
		
		/////////////////////////////////////////////////////////////////////////
		// id pw text 박스
		JTextField id_register = new JTextField();
		id_register.setBounds(30,50,200,40);
		// text박스 테두리 제거
		//id_register.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
		
		JTextField pw_register = new JTextField();
		pw_register.setBounds(30,100,200,40);
		// text박스 테두리 제거
		//pw_register.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
		
		/////////////////////////////////////////////////////////////////////////
		// 회원가입 버튼 , id중복확인 버튼
		JButton register_btn = new JButton("회원가입");
		register_btn.setBounds(30,150,100,100);
		// 마우스 오버시 외곽선 제거
		register_btn.setBorderPainted(false);
		// 버튼 배경을 투명
		register_btn.setContentAreaFilled(false);
		
		/////////////////////////////////////////////////////////////////////////
		// 버튼 리스너
		ActionListener ac_btn = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("회원가입")) {
					
					
					
				}
				else if(e.getActionCommand().equals("확인")){
					
				}
			}
		};
		
		/////////////////////////////////////////////////////////////////////////	
		// 회원가입 버튼 id확인 버튼 리스너 장착
		register_btn.addActionListener(ac_btn);
		// check_btn.addActionListener(ac_btn);
		
		/////////////////////////////////////////////////////////////////////////
		
		f_register.add(register_btn);
		f_register.add(id_register);
		f_register.add(pw_register);
		
		/////////////////////////////////////////////////////////////////////////
		
		f_register.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f_register.setVisible(true);
	}
	
	
	
	public void register(Frame f_h) {
		
//		String path = "c:/KHairline/" + user.get
		
		List<User> user_list = new ArrayList<User>();
		
		
	}
}
