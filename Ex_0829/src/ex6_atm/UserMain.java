package ex6_atm;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		/*
		 * 1. 입	금
		 * 2. 출	금
		 * 3. 잔액확인
		 * etc.종료
		 * >>1  입력
		 * --입	금--
		 * 입금액 : 1000
		 * 입금성공
		 * --------
		 * 1. 입	금
		 * 2. 출	금
		 * 3. 잔액확인
		 * etc.종료
		 * */
		Scanner sc = new Scanner(System.in);
		Atm atm = new Atm();
		int num =1;
		out:while(num <=3) {
			atm.showMenu();
			System.out.print(">>");
			num = sc.nextInt();
			switch(num) {
			case 1:
				atm.deposit();	//입금
				continue;
			case 2:
				atm.withdrawal(); // 출금
				continue;
			case 3:
				atm.check_balance(); // 잔액확인
				continue;
				default:
					break out;
			}
		}
	
		
	}
}
