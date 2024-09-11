package work;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class GameWriter {
	
	public void setGameWriter(User user) { //저장
		String path = "c:/IOtest/RockScissorsPaper/" + user.getId().trim() + "/game.sav";
		
		File f1 = new File("c:/IOtest/RockScissorsPaper");
		
		if(!f1.exists()) {
			f1.mkdirs();
		}
		
		File f2 = new File(f1,user.getId().trim());
		
		if(!f2.exists()) {
			f2.mkdirs();
		}
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(user);
			
			
		} catch (Exception e) {
			System.out.println("저장 실패");
			// TODO: handle exception
		}finally {
			try {
				
				if(oos != null)
					oos.close();
				if(fos != null)
					fos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
