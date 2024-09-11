package work;


public class Money {

	public int[] mm(String m) {

		int money[] = {500,100,50,10};
		int cnt[] = {0,0,0,0};
		int my_money = Integer.parseInt(m); // 정수형으로 형변환

		String s="";
		for(int i=0; i<money.length; i++) {
			while(true) {
				if(my_money >= money[i]) {
					my_money -= money[i];
					cnt[i]++;
				}
				else {
					break;
				}
			}
		}
		System.out.println(s);
		return cnt;

	}
}
