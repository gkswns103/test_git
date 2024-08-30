package ex8_work;

import java.util.Scanner;

public class WorkMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 관광객 수 : 2		// 1.이름:hong
		// 1.이름 : hong		// 1.나이:20
		// 1.나이 : 20		// 1.목적지:불국사
		// ------------		// ------------
		// 2.이름 : lee		// 1.이름:lee
		// 2.나이 : 22		// 1.나이:22
		// ------------		// 1.목적지:불국사
		// 1.관광객 정보		// ------------
		// 2.목적지 변경		// 1.관광객 정보
		// etc.종료			// 2.목적지 변경
		// >>1				// etc.종료
							// >>2
							// 어디로 변경? : 석굴암	
							// --변경완료--
		
		System.out.print("관광객 수 :");
		int num = sc.nextInt();
		Tourist t = new Tourist();
		Guide g = new Guide();
		t.tourist(num);
		int n =0;
		w:while(n < 3) {
			System.out.println("1.관광객 정보");
			System.out.println("2.목적지 변경");
			System.out.println("etc.종료");
			System.out.print(">>");
			n = sc.nextInt();
			switch(n) {
			case 1:
				t.touristInfo(g);
				continue;
			case 2:
				System.out.print("어디로 변경? : ");
				Guide.location = sc.next();
				continue;
			default:
				break w;
			}
		}
	}
}
