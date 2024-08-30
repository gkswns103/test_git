package ex6_atm;

import java.util.Scanner;

public class Atm {

	private int money;
	
	// 메뉴
	public void showMenu() {
		System.out.println("1. 입\t금");
		System.out.println("2. 출\t금");
		System.out.println("3. 잔액확인");
		System.out.println("etc. 종 료");
	}
	Scanner sc = new Scanner(System.in);
	// 입급기능
	public void deposit() {
		System.out.println("--입 금--");
		System.out.print("입금액 :");
		int deposit_money = sc.nextInt();
		System.out.println("입금성공");
		System.out.println("-------------");
		System.out.println();
		this.money += deposit_money;
	}
	// 출금기능
	public void withdrawal() {
		System.out.println("--출 금--");
		System.out.print("출금액 :");
		int withdrawal_money = sc.nextInt();
		if(this.money < withdrawal_money) {
			System.out.println("잔액이 부족합니다");
			System.out.println();
		}
		else {
			this.money -= withdrawal_money;
			System.out.println("출금성공");
			System.out.println("-------------");
			System.out.println();
		}
	}
	// 잔액확인
	public void check_balance() {
		System.out.println("잔액: " + this.money + "원");
		System.out.println();
	}
	
}
