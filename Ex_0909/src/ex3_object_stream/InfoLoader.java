package ex3_object_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class InfoLoader {

	private User user;

	public User loaderInfo( String tel ) {

		String path = "c:/IOtest/User/" + tel + "/save.sav";

		File f = new File(path);
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);

				user = (User)ois.readObject();
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					
					if( ois != null )
						ois.close();
					if( fis != null )
						fis.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}else {
			System.out.println("가져올 정보가 없습니다.");
		}
		return  user;
	}
}
