package ex7_work;

public class Exwork {

	private String result = "";
	
	public void getResult(String s) {
		
		for(int i = 0; i < s.length(); i++) {
			
			if( result.indexOf( s.charAt(i) ) == -1) { // result에 입력받은 값에 단어가 없는경우
				result += s.charAt(i);
			}
			else {
				continue;
			}
			
		}
		System.out.print("출력 : " + result);
		
	}
	
	
}
