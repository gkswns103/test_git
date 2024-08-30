package ex9_work;

import java.util.Random;
import java.util.Scanner;

public class NumBaseBall {
	public static void main(String[] args) {

		// 1 ~ 9 사이의 난수 세개를 중복되지 않도록 생성하고
		// 키보드에서 입력받은 값으로 strike,ball,out 을 판단
		// 
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int num[] = new int[3];
		String s = "";
		outer : for(int i=0; i < num.length;) {

			num[i] = new Random().nextInt(9) + 1; // 1 ~ 45 난수 지정

			for(int j =0; j < i; j ++) {

				if(num[i] == num[j]) {
					continue outer;
				}
			}
			s += num[i];
			i++;
		}

		System.out.println(s);
		whileout:while(true) {
			int s_cnt = 0, b_cnt = 0; // 스트라이크 볼 카운터
			System.out.print("입력 : ");
			String b = sc.next();
			out:for(int i =0; i < num.length; i++) {

				for(int j =0; j < b.length(); j++) {
					if(s.charAt(i) == b.charAt(j)) {
						if(i == j) {
							s_cnt++;
						}
						else if(i != j){
							b_cnt++;
						}
					}
				}// infor
			}//	outfor
			if(s_cnt ==0 && b_cnt ==0) {
				System.out.println("out!!");
			}
			else {
				System.out.println(s_cnt + "S " + b_cnt + "B");
			}
			if(s_cnt == 3) { // 정답 무한루프 탈출
				break whileout;
			}
		}//while
		System.out.println("정답!!");
	}
}
