package ex5_class_array;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vending v = new Vending();
		System.out.print("금액 :");
		int mymoney = sc.nextInt();
		v.showCans(mymoney);
		System.out.print(">>>");
		String buycan = sc.next();
		v.selectCan(buycan);
	}
}
