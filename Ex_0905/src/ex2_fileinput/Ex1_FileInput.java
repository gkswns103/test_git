package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		// ....Stream : 바이트 기반의 스트림(1byte)
		// ....Reader, ....Writer : char 기반의 스트림(2byte)
		
		String path = "C:\\Iotest\\test.txt";
		
		File f = new File(path);
		FileInputStream fis = null;
		
		if( f.exists() ) {
			
			try {
				fis = new FileInputStream(f); 
				int code = 0;
				
				// 접근한 path경로에서 더이상 읽을게 없을 때까지(EOF(End Of File) : -1)
				// 반복문을 수행한다
				while( (code = fis.read()) != -1 ) {
					
					char ch = (char)code;
					System.out.print(ch);
					
				}
				
				
			} catch (Exception e) {
				
			}finally{
				try {
					fis.close();  // 스트림객체를 다 사용후 반드시 닫아야함.
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
}
