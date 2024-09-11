package ex1_file;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		
		String path = "c:/IOtest/aaa";
		File f = new File(path);
		
		// file 클래스가 참조하는 path경로가 물리적으로
		// 존재하지 않는다면...
		if( !f.exists() ) {
			f.mkdirs(); // 폴더들을 생성하는 메서드
		}
		else {
			System.out.println("이미 폴더가 있음");
		}
	}
}
