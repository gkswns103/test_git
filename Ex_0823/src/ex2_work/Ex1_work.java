package ex2_work;

import java.util.Random;

public class Ex1_work {
	public static void main(String[] args) {

		// 변수 money에 10 ~ 5000 사이의 난수 입력
		// 단 1710 3450과 같이 1의자리 숫자는 반드시 0이여야한다.
		// coin배열을 사용하려 난수 money를 동전으로 바꿨을때
		// 가장 적ㅇㄴ수의 동전을 사용하는 경우의 수 출력
		int money=0;
		while (true) {
			money = new Random().nextInt(5000 - 10 + 1) + 10;
			if (money % 10 == 0) {
				break;
			}
		}
		int coin[] = { 500, 100, 50, 10 };

		System.out.println("값 :" + money);
		int i,k,j,l;
		out:for(i = 0; i < money-i*coin[3]; i++) {
			for(j = 0; j < money-j*coin[2]; j++) {
				for(k = 0; k < money-k*coin[1]; k++) {
					for(l = 0; l < money-l*coin[0]; l++) {
						if(money == ((i*coin[3]) + (j*coin[2]) + (k*coin[1]) + (l*coin[0]))) {
							System.out.printf("500원 : %d \n100원 : %d \n50원 : %d \n10원 : %d \n",l,k,j,i);
							break out;
						}

					}
				}
			}
		}
	}
}
