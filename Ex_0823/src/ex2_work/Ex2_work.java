package ex2_work;

import java.util.Random;


public class Ex2_work {
	static int lotto[] = new int[6];
	
	public static void main(String[] args) {

		// 1 ~ 45사이의 중복되지 않는 난수들의 저장하는 lotto배열을 만들고
		// 값을 출력하기
		outer : for(int i=0; i < lotto.length;) {
			
			lotto[i] = new Random().nextInt(45) + 1; // 1 ~ 45 난수 지정
			
			for(int j =0; j < i; j ++) {
				
				if(lotto[i] == lotto[j]) {
					continue outer;
				}
			}
			
			System.out.print(lotto[i] + " ");
			i++;
		}
		
		
	}
}
		/*
		for (int i = lotto.length; i <= 0; i--) {
			lotto[i] = new Random().nextInt(6) + 1; // 1 ~ 45 난수 지정
			while(true) {
				if(hong(lotto,i) == true) {
					break;
				}
				else {
					continue;
				}
			}
			System.out.print(lotto[i] + " ");
		}

	}

	public static boolean hong(int arr[],int size) {
		int cnt = 0;
		if(size == 0) {
			return true;
		}
		else {
			while(true) {
				if(arr[size] == arr[cnt]) { // 같은지 확인 후 같으면 다시
					arr[size] = new Random().nextInt(6) + 1;
					continue;
				}
				else if(cnt == 6){
						break;
					}
				else
					cnt++;

				}
			}
		return true;
	}
}
*/
