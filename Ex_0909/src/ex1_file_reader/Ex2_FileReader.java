package ex1_file_reader;

import java.io.File;
import java.io.FileReader;

public class Ex2_FileReader {

	public static void main(String[] args) {
		
		// test.txt의 내용을 읽어서
		// 알파벳 대문자의 갯수와, 소문자의 갯수를 출력
		
		File f = new File("c:/IOtest/test.txt");
		FileReader fr = null;
		
		try {
			
			fr = new FileReader(f);
			int read = 0;
			int num1 = 0, num2 = 0, num3 =0;		
			while((read = fr.read()) != -1) {
				
				if( (char)read >= 'A' && (char)read <= 'Z' ) {
					num1++;
				}
				else if( (char)read >= 'a' && (char)read <= 'z' ) {
					num2++;
				}
				else {
					num3++;
				}
			}
			System.out.println("대문자 : " + num1);
			System.out.println("소문자 : " + num2);
			System.out.println("한글 : " + num3/2);
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			try {
				
				if( fr != null )
					fr.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}
	
}
