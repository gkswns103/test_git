package ex4_memo;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class MemoTest {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(500,200, 250,400);
		
		Font font = new Font("",Font.PLAIN,20);
		
		TextField tf = new TextField();
		tf.setFont(font);
		tf.setBounds(10,40,180,25);
		
		Button btn = new Button("OK");
		btn.setBounds(195,40,50,25);
		//버튼 비활성화
		btn.setEnabled(false);
		
		//여러줄을 입력받는것이 가능한 TextArea
		TextArea ta = new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10, 80, 230, 250);
		// ta.비활성화
		ta.setEditable(false);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		//버튼준비
		Button btn_Save = new Button("Save");
		btn_Save.setBounds(10, 340, 110, 40);
		
		Button btn_Close = new Button("Close");
		btn_Close.setBounds(130, 340, 110, 40);
		
		f.add(btn);
		f.add(tf);
		f.add(ta);
		f.add(btn_Save);
		f.add(btn_Close);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//TextField에 값이 들어있는 경우에만 ok버튼 활성화
		tf.addTextListener(new TextListener() {	
			@Override
			public void textValueChanged(TextEvent e) {
				if(tf.getText().equals(""))
					btn.setEnabled(false);
				else
					btn.setEnabled(true);
			}
		});
		
		//OK버튼 클릭 감지
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText() + "\n");
				
				//TextField의 내용을 비우고 커서를 이동
				tf.setText("");
				//커서가 처음으로 돌아감
				tf.requestFocus();
			}
		});
		
		//키보드의 엔터값 감지
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					ta.append(tf.getText() + "\n");
					
					//TextField의 내용을 비우고 커서를 이동
					tf.setText("");
					//커서가 처음으로 돌아감
					tf.requestFocus();
				}
				
			}
		});
		
		btn_Close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//Save버튼 클릭시 TextArea의 값을 저장
		btn_Save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String message = ta.getText();
				FileWriter fw = null;
				BufferedWriter bw = null;
				
				try{
					
					FileDialog fd = new FileDialog(f,"저장",FileDialog.SAVE);
					fd.setVisible(true);
					
					//저장경로 얻어오기
					String path = fd.getDirectory() + fd.getFile();
					
					//저장을 하지 않고 취소버튼을 누른경우
					if(fd.getFile() == null) {
						JOptionPane.showMessageDialog(f,"저장하지 않았습니다");
					}
						
					
					
					//스트림으로 message를 기록
					fw = new FileWriter(path);
					bw = new BufferedWriter(fw);
					
					
					bw.write(message);
					
					bw.flush();
					
					if(fd.getFile() != null) {
						JOptionPane.showMessageDialog(f,"저장 완료");
					}
					
				}catch (Exception e2) {
					
				}finally {
					try {
						if(bw != null)
							bw.close();
						if(fw != null)
							fw.close();
					}catch (Exception e2) {
						// TODO: handle exception
					}
					
				}
				
			}
		});
		
		//프레인 크기 고정
		f.setResizable(false);
		f.setVisible(true);
	}
}
