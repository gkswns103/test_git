package ex2_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex3_FileInput {

	public static void main(String[] args) {
		
		String path = "C:\\java_LHJ\\work\\Ex_0903\\src\\ex12_work\\Work.java";
		File f = new File(path);
		FileInputStream fis = null;
		byte[] b = new byte[(int)f.length()];
		
		if(f.exists()) {
			
			try {
				fis = new FileInputStream(f);
				// b배열에 넣기
				fis.read(b);
				
				String res = new String(b);
				System.out.println(res.trim());
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
}
