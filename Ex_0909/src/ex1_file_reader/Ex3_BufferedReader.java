package ex1_file_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex3_BufferedReader {
	public static void main(String[] args) {
		
		File f = new File("c:/IOtest/test.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			
			String msg = "";
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
				if( br != null)
					br.close();
				if( fr != null)
					fr.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
