package Ex6_label;

public class Ex2_label_continue {
	public static void main(String[] args) {
		
		out:for(int i =1; i <= 3; i++) {
			
			for(int j =1; j <= 5; j++) {
				
				if(j %2 ==0) {
					continue out;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
