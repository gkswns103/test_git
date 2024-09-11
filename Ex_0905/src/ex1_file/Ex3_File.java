package ex1_file;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		
		String path = "C:\\java_LHJ\\util\\eclipse";
		
		File f = new File(path);
		
		if( f.isDirectory()) {
			File[] chF = f.listFiles();
			for(int i =0; i<chF.length; i++) {
				if(chF[i].isDirectory()) {
					System.out.println(chF[i].getName());
				}
			}
			
		}
		
	}
}
