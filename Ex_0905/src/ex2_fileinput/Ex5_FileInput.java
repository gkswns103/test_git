package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex5_FileInput {
	public static void main(String[] args) {
		
		// test.txt의 내용을 읽어서
		// 회문인지 아닌지를 판별
		
		String path = "C:\\Iotest\\test.txt";
		File f = new File(path);
		FileInputStream fis = null;
		byte b[] = new byte[(int)f.length()];
		
		if(f.exists()) {
			
			try {
				fis = new FileInputStream(f);
				fis.read(b);
				String str = new String(b);
				int j = str.length();
				for(int i=0; i<str.length(); i++) {
					--j;
						if(str.charAt(i) == str.charAt(j)) {
							if(i > j) {
								System.out.println(str + " 은 회문입니다.");
								break;
							}
						}
						else {
							System.out.println(str + " 은 회문이 아닙니다.");
							break;
					}
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if( fis != null ) {
						fis.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
