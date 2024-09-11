package work2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class HighScore {

	public void outputScore(int playCount) {
		
		File saveFile = new File("C:\\Iotest\\save.txt");
		byte b_read[] = new byte[(int)saveFile.length()];
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(saveFile);
			fis.read(b_read);
			
			String inputText = new String(b_read);
			
			int high = Integer.parseInt(inputText);
			
			if ( playCount < high ) {
				System.out.println("최고기록 달성");
				fos = new FileOutputStream(saveFile);
				//String cnt = "" + playCount;
				String cnt = String.valueOf(playCount); // 정수값을 문자열로 변환
				fos.write(cnt.getBytes());
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				
				if( fis != null ) {
					fis.close();
				}
				
				if( fos != null ) {
					fos.close();
				}
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
}
