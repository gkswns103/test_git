package work;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class GameLoader {

	private User user;
	
	public User gameLoader(String id) {
		
		String path = "c:/IOtest/RockScissorsPaper/" + id + "/game.sav";
		
		File f = new File(path);
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			
			user = (User)ois.readObject();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
				if(ois != null)
					ois.close();
				if(fis != null)
					fis.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return user;
	}
	
}
