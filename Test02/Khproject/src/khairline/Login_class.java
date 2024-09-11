package khairline;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login_class {
	
	public Login_class() { // 생성자
		
		// 로그인 화면
		
		//////////////////////////////////////////////////////////////
		
		Frame f_home = new Frame("KH Airline");
		f_home.setLayout(null);
		f_home.setBounds(50, 50, 1800, 900);
		
		//////////////////////////////////////////////////////////////
		// 프레임 백그라운드 사진 설정
		
		ImageIcon img_home = new ImageIcon("img/home.png");
		JLabel home_label = new JLabel(img_home);
		home_label.setBounds(0,0,1800, 900);
		
		//////////////////////////////////////////////////////////////
		// 로그인 백그라운드 사진 설정
		
		ImageIcon img_login = new ImageIcon("img/login.png");
		JLabel login_label = new JLabel(img_login);
		login_label.setBounds(150,250,400,500);
		
		//////////////////////////////////////////////////////////////
		// 로그인 버튼
		
		ImageIcon img_loginbtn_back = new ImageIcon("img/loginbackbtn.png");
		JLabel loginbtn_back_label = new JLabel(img_loginbtn_back);
		loginbtn_back_label.setBounds(200,555,280,50);
		JButton login_btn = new JButton("로그인");
		login_btn.setFont(new Font("",Font.PLAIN,30));
		login_btn.setBounds(200,555,280,50);
		// 마우스 오버시 외곽선 제거
		login_btn.setBorderPainted(false);
		// 버튼 배경을 투명
		login_btn.setContentAreaFilled(false);
		
		//////////////////////////////////////////////////////////////
		// 회원가입 버튼
		
		JButton register_btn = new JButton("회원가입");
		register_btn.setForeground(Color.GRAY);
		register_btn.setFont(new Font("",Font.PLAIN,15));
		register_btn.setBounds(295,650,100,50);
		// 마우스 오버시 외곽선 제거
		register_btn.setBorderPainted(false);
		// 버튼 배경을 투명
		register_btn.setContentAreaFilled(false);
		
		//////////////////////////////////////////////////////////////
		// 아이디 비밀번호 text
		
		JTextField tf_id = new JTextField();
		tf_id.setBounds(200, 400, 300, 30);
		tf_id.setFont(new Font("",Font.PLAIN,20));
		tf_id.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
		
		JTextField tf_pw = new JTextField();
		tf_pw.setBounds(200, 500, 300, 30);
		tf_pw.setFont(new Font("",Font.PLAIN,20));
		tf_pw.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
		
		//////////////////////////////////////////////////////////////
		// 로그인 회원가입 버튼 리스너
		
		//회원가입 버튼 클릭시
		register_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Register_class rc = new Register_class();
				rc.register(f_home);
			}
		});
		
		//////////////////////////////////////////////////////////////
		
		f_home.add(tf_pw);
		f_home.add(tf_id);
		f_home.add(register_btn);
		f_home.add(login_btn);
		f_home.add(loginbtn_back_label);
		f_home.add(login_label);
		f_home.add(home_label);
		
		f_home.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f_home.setVisible(true);
	}
}
