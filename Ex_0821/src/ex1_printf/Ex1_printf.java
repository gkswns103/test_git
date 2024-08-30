package ex1_printf;

import java.net.MulticastSocket;

public class Ex1_printf {
	public static void main(String[] args) {
		
		int age = 30;
		System.out.printf("제 나이는 %d살 입니다.\n", age);
		System.out.printf("회사에서 집까지 %d km입니다.\n\n", 20);
		
		
		System.out.printf("%d%c-%02d%c-%d%c%s\n",2024,'년',8,'월',21,'일',"입니다.");
		
		// 저는 A형 이고, 키는 170.5입니다
		System.out.printf("저는 %c형 이고, 키는 %f입니다.\n",'A',170.5);
		
		// 오늘 기온은 32.7도 입니다.
		float temp = 32.7f;
		System.out.printf("오늘 기온은 %.1f도 입니다.\n",temp);
		
		String region = "감자국";
		System.out.printf("제 고향은 %s입니다.\n",region);
		
		// 저의 나이는 20이고, 사는곳은 경북입니다.
		System.out.printf("저의 나이는 %d이고, 사는곳은 %s입니다.\n",20,"경북");
		
		//저는 상위 15%입니다
		System.out.printf("저는 상위 %d%%입니다",15);
	}
}
