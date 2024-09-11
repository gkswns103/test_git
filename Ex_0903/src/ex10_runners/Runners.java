package ex10_runners;

import java.util.Random;

public class Runners {
	public static void main(String[] args) {
		
		int playerRandom[] = new int[20]; // 20개 배열 생성
		String playerJump[] = new String[playerRandom.length]; // 20개 배열 생성
		for( int i=0; i<playerJump.length; i++ ) {
			playerJump[i] = ""; // 플레이어 점프 배열 초기화
		}
		
		boolean finish = false;	// 게임이 끝났는지 확인
		int finishPlayer = 0;	// 우승자 플레이어 저장 변수
		
		while(true) {
			
			for( int i=0; i<playerJump.length; i++ ) {
				playerRandom[i] = new Random().nextInt(3); // 플레이어 랜덤에 0 1 2 3개의 숫자랜덤 생성
			}
			
			try {										// 이동한는게 보이기 위해 0.1초 딜레이 검
				Thread.sleep(100); // 0.1초 딜레이
			} catch (Exception e) {
				
			}
			
			for( int i=0; i<playerJump.length; i++ ) { // 플레이어 랜덤에 생성된 숫자만큼 시프트
				
				switch( playerRandom[i] ) {
				case 0:
					playerJump[i] += "";
					break;
					
				case 1:
					playerJump[i] += " ";
					break;
					
				case 2:
					playerJump[i] += "  ";
					break;
				}
				
			}
			// 플레이어 출력
			System.out.println("----------------------------------------------------------------------------------------------------");
			
			for( int i =0; i<playerJump.length; i++ ) {
				
				System.out.print(playerJump[i]);
				System.out.println(i + 1 + "옷");
				
				if( playerJump[i].length() >= 50 ) {
					finishPlayer = i + 1;
					finish = true;
				}
				
			}
			
			System.out.println("----------------------------------------------------------------------------------------------------");
			// 우승자 출력
			if( finish ) {
				System.out.println("winner - " + finishPlayer);
				break;
			}
			
			
		}
	}
}
