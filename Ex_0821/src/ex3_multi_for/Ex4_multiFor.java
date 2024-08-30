package ex3_multi_for;

public class Ex4_multiFor {
	public static void main(String[] args) {
		
		// A B C D
		// E F G H
		// I J K L
		
		char c = 'A';
		for(int i=0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.printf("%c ",c);
				c++;
			}
			System.out.println();
		}
	}
}