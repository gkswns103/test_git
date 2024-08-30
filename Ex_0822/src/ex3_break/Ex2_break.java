package ex3_break;

import java.util.Random;

public class Ex2_break {
	public static void main(String[] args) {
		
		while(true) {
			
			 int rnd = new Random().nextInt(3) + 1;
			
			 switch(rnd) {
			 case 1:
				 System.out.println("1 생성");
				 break;
			 case 2:
				 System.out.println("2 생성");
				 break;
			 }
			 if(rnd == 3) {
				 break;
			 }
			 
		}
		
	}
}
