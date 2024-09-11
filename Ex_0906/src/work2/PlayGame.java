package work2;

import java.util.Scanner;

public class PlayGame {

	Scanner sc = new Scanner(System.in);
	char[] star;
	int playCount = 0;
	boolean check = false;
	
	// 게임이 진행중임을 확인하는 변수
	boolean isPlaying = false;
	
	public int play( String word ) {
		
		star = new char[word.length()];
		
		for(int i = 0; i < star.length; i++) {
			star[i] = '☆';
		}
		
		label : while(true) {
			
			playCount++;
			System.out.print("word : ");
			for(int i = 0; i < star.length; i++) {
				System.out.print(star[i]);
			}
			System.out.print(">> ");
			String in = sc.next();
			char ch = in.charAt(0);
			
			if(ch <'a' || ch > 'z' || in.length() > 1) {
				System.out.println("한글자의 영 소문자만 입력하세요");
				continue;
			}
			
			check = false;
			isPlaying = false;
			
			for(int i = 0; i < word.length(); i++) {
				
				// 중복값 입력 여부
				if(star[i] == ch) {
					System.out.println(ch + "이미 입력한 문자입니다.");
					continue label;
				}
				
				// 일치하는 단어 확인
				if( ch == word.charAt(i) ) {
					star[i] = ch;
					check = true;
				}
				
				if(star[i] == '☆') {
					isPlaying = true;
				}
				
				
			}
			if (!check) {
				System.out.println(ch + "이(가) 포함되어 있지 않습니다");
			}
			// 게임종료
			if(!isPlaying) {
				System.out.println(word + "정답!!");
				System.out.println(playCount + "회 만에 정답");
				break;
			}
		}
		
		return playCount;
	}
	
}
