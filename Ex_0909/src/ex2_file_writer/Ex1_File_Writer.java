package ex2_file_writer;

import java.io.File;
import java.io.FileWriter;

public class Ex1_File_Writer {
	public static void main(String[] args) {
		
		File f = new File("c:/IOtest/fileWriter.txt");
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter(f,true);
			fw.write("나는 fileWriter의 예제입니다.\n");
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
				if( fw != null )
					fw.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
