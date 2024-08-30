package ex6_method_calculator;

public class CalPrint {
	
	
	public void printResult(int a, int b, char c) {
		switch (c) {
		case '+':
			System.out.printf("%d + %d = %d",a,b,a+b);
			break;
		case '-':
			System.out.printf("%d - %d = %d",a,b,a-b);
			break;
		case '*':
			System.out.printf("%d * %d = %d",a,b,a*b);
			break;
		case '/':
			System.out.printf("%d / %d = %d",a,b,a/b);
			break;
		}
	}
}
