package ex5_class_array;

public class Vending {
	private Can[] cans = new Can[5];
	private int money;
	
	public Vending() {
		cans[0] = new Can("fanta",1000);
		cans[1] = new Can("cider",1200);
		cans[2] = new Can("orange",800);
		cans[3] = new Can("banana",1100);
		cans[4] = new Can("coke",900);
	}
	public void showCans(int m) { // 소지금액보다 싼 음료 출력 메서드
		this.money = m;
		for(int i =0; i < cans.length; i++) {
			if(m >= cans[i].getMoney()) {
				System.out.printf("%s - %d\n",cans[i].getName(),cans[i].getMoney());
			}
		}
	}
	
	public void selectCan(String name) {
		
		for(int i =0; i < cans.length; i++) {
			if(cans[i].getName().equals(name)) {
				System.out.println(cans[i].getName() + "을 선택함");
				System.out.println("잔액 : " + (money-cans[i].getMoney()) + "원");
			}
		}
		
	}
}
