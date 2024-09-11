package ex1_byte_stream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex3_BufferedInput {
	public static void main(String[] args) {
		
		File f = new File("c:/IOtest/test.txt");
		byte read[] = new byte[(int)f.length()];
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 :");
		String s = sc.next();
		
		int cnt = 0;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);
			
			bis.read(read);
			
			String res = new String(read).trim();
			for(int i=0; i<res.length(); i++) {
				String str = "" + res.charAt(i);
				if(s.equals(str)) {
					cnt++;
				}
			}
				System.out.println(s + "의 갯수 : " + cnt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fis != null)
					fis.close();
				if(bis != null)
					bis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
