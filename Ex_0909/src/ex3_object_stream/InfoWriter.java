package ex3_object_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class InfoWriter {
	
	public void setWriteInfo(User user) {
		
		String path = "c:/IOtest/User/" + user.getTell().trim() + "/save.sav";
		File dir1 = new File("c:/IOtest/User");
		
		if(!dir1.exists()) {
			dir1.mkdirs();
		}
		
		File dir2 = new File(dir1, user.getTell().trim());
		
		if(!dir2.exists()) {
			dir2.mkdirs();
		}
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			//User 객체를 통째로 기록하나.
			oos.writeObject(user);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("기록 저장 실패");
			// TODO: handle exception
		}finally {
			
			try {
				
				if ( oos != null )
					oos.close();
				if ( fos != null )
					fos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}
	
}
