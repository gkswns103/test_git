package ex8_work;

public class ActorMain {
	public static void main(String[] args) {
		
		// 배우검색 : lee 입력
		// [lee]
		// 광해
		// 레드
		// 지아이조

		// 배우검색 : mmm
		// 해당배우가 존재하지 않습니다.s
		
		String[][] actor = {{"[song]","박쥐","괴물","관상"},
							{"[ma]","범죄도시","더파이브","챔피언"},
							{"[lee]","광해","레드","지아이조"}};
		Actor a = new Actor();
		a.select(actor);
	}
}
