package ex8_work;

public class Work {

	String result = "";
	
	public void printOdd( String input ) {
		
		for(int i = 0; i < input.length(); i++) {
			
			if( i % 2 == 0) {
				
				result += input.charAt(i);
				
			}
			
		}
		System.out.println(result);
		
	}
	
}
