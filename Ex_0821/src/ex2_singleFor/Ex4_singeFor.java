package ex2_singleFor;

import java.util.Scanner;

public class Ex4_singeFor {
	public static void main(String[] args) {

		// 키보드에서 값을 받고, 입력받은 값에 해당하는 구구단을 출력
		// 2~ 9 사이의 값을 입력

		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		int num = sc.nextInt();
		switch (num) {
		case 2: case 3: case 4: case 5:
		case 6: case 7: case 8: case 9:{
			for(int i = 1; i < 10; i++) {
				System.out.printf("%d x %d = %d\n",num,i,num * i);
			}
			break;
		}
		default:
			System.out.print("2~9값을 입력하세요");
		}
	}
}
