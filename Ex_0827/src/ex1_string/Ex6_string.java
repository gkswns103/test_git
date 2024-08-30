package ex1_string;

import java.util.Scanner;

public class Ex6_string {
	public static void main(String[] args) {

		// 입력 : abcabc
		// 결과 : a2b2c2 <-


		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();
		for(int i =0; i < str.length(); i++) {

			int cnt =0;	// 초기 카운터값 본인포함 1

			out:while(true) {
				for(int j =i; j <str.length(); j++) {	// 본인 다음문자부터 확인
					if( str.charAt(i) == str.charAt(j)) {	// 본인과 같은 문자가 있을시 카운터변수 증가
						cnt++;
					}

					if(i !=0) {
						for(int l = i-1; l >= 0; l--) {
							if( str.charAt(i) == str.charAt(l)) {	// 문자뒤에 같은게 있으면 나가기
								break out;
							}
						}
					}
				}
				System.out.printf("%s:%d ",str.charAt(i),cnt);
				break out;
			}
		}
	}

}
