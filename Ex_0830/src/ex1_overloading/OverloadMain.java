package ex1_overloading;

public class OverloadMain {
	public static void main(String[] args) {
		
		OverLoadTest ot = new OverLoadTest();
		
		ot.result();
		ot.result(10);
		ot.result('A');
		ot.result("hi",10);
		ot.result(10,"hi");
	}
}
