package work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {

		// id,승,무,패, 정보를 가지는 클래스를 만든다
		// 가위 바위 보 게임을 한 뒤, 그 결과를 클래스에 세팅하고
		// Object스트림으로 저장 및 로드

		// id: aaa
		// 새로운 유저
		// 0승 0무 0패
		// ------------
		// 가위(s) || 바위(r) || 보(p) : s
		// 당신이 졌습니다.
		// 0승 0무 1패
		// 다시? y | n : y
		// ------------
		// 가위(s) || 바위(r) || 보(p) : p
		// 비겼습니다.
		// 0승 1무 1패
		// 다시? y | n : n
		// 게임종료

		//id : aaa
		//로드성공
		//0승1무1패
		//-------------

		Scanner sc = new Scanner(System.in);
		GameLoader gl = new GameLoader();
		GameWriter gw = new GameWriter();
		User user = new User();
		
		System.out.print("id : ");
		String user_id = sc.next();
		try {
			if (gl.gameLoader(user_id) != null){ // 이미 아이디가 있는 유저일경우
				user = gl.gameLoader(user_id);
				System.out.println("로드성공");
			}
			else { // 새로운 유저일경우
				System.out.println("새로운 유저");
				user.setId(user_id);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(user.getWin() + "승" + user.getDraw() + "무" + user.getLose() + "패");
		while(true) {
			System.out.print("가위(s) || 바위(r) || 보(p) : ");
			String srp = sc.next();
			SrpGame srpgame = new SrpGame();
			switch (srpgame.game(srp)) {
			case "win":
				System.out.println("당신이 이겼습니다");
				user.setWin();
				break;
			case "draw":
				System.out.println("비겼습니다");
				user.setDraw();
				break;
			case "lose":
				System.out.println("당신이 졌습니다");
				user.setLose();
				break;
			}
			System.out.println(user.getWin() + "승" + user.getDraw() + "무" + user.getLose() + "패");
			gw.setGameWriter(user);
			System.out.print("다시? y | n : ");
			String str = sc.next();
			System.out.println("--------------------");
			if(str.equals("y"))
				continue;
			else
				break;
		}
		System.out.println("게임 종료");
	}

}
