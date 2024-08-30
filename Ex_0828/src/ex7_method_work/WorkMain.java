package ex7_method_work;

public class WorkMain {
	public static void main(String[] args) {
		
		// question이 OOXXO라면 1 + 2 + 0 + 0 + 1의 결과인 4
		// OXXOOXOOO 1 + 0 + 0 + 1 + 2 + 0 + 1 + 2 + 3 = 10
		String question = "OXXOOXOOO";
		
		TestResult t = new TestResult();
		t.printRes(question);
	}
}