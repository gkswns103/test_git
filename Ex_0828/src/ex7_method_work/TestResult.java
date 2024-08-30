package ex7_method_work;

public class TestResult {

	public void printRes(String s) {
		// 연산 및 최종 결과 출력
		int sum = 0 ,cnt=0;
		// OXXOOXOOO 1 + 1 + 2 + 1 + 2 + 3 = 10 
		// 100
		// 1
		for(int i=0; i < s.length(); i++) {
				if(s.charAt(i) == 'O') {
					cnt++;
				}
				else {
					cnt =0;
				}
				sum += cnt;
		}	
		System.out.println(sum);
	}
}
