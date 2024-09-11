package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;

public class Ex4_FileInput {
	public static void main(String[] args) {
		
		// test.txt.의 내용을 읽어 숫ㅅ자들의 합만 출력
		
		String path = "C:\\Iotest\\test.txt";
		File f = new File(path);
		FileInputStream fis = null;
		
		int sum = 0;
		int code =0;
		if(f.exists()) { // 파일이 있을경우
			try {
				fis = new FileInputStream(f);
				// fis.read() 는 아스킷코드 숫자로 code에 넣고
				while ((code = fis.read()) != -1) {
					
					char ch = (char)code;
					if(ch >= '0' && ch <= '9') {
						String s = "" + ch;
						sum += Integer.parseInt(s);
					}
					
//					// code의 아스킷코드 숫자를 문자로 변환하고 s문자열에 넣기
//					String s = "" + (char)code;
//					
//					try {
//						// s문자열에 들어간 값이 숫자인경우 sum에 더해짐
//						sum += Integer.parseInt(s);
//					}catch(Exception e){
//						// s문자열에 들어간 값이 숫자가 아닌경우는 오류발생으로 인해 catch로 들어와 다시 while로 돌아감
//					}
//					
				}
				System.out.println(sum);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
}
