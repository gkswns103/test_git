package work2;

import java.util.Random;

public class HangManMain {

	public static void main(String[] args) {
		
		String word[] = {"apple", "test","doctor"};
		int rnd = new Random().nextInt(word.length);
		
		PlayGame pg = new PlayGame();
		int playCount = pg.play(word[rnd]);
		
		HighScore hs = new HighScore();
		hs.outputScore(playCount);
		
	}
	
}
