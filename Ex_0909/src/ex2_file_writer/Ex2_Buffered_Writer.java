package ex2_file_writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex2_Buffered_Writer {
	public static void main(String[] args) {
		
		File f = new File("c:/IOtest/bufferedWriter예제.txt");
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			
			bw.write("bufferedWirter의 예제에요");
			bw.newLine(); // 줄바꿈 메서드
			bw.write("나는 두번째 줄 덩실덩실");
			
			bw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			try {
				
				if( bw != null )
					bw.close();
				if( fw != null )
					fw.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}
}
