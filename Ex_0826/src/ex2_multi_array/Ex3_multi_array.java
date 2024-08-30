package ex2_multi_array;

public class Ex3_multi_array {
	public static void main(String[] args) {
		
		String stu[][] = {{"길순","100","90"},{"길동","80","92","85"}};
		
		for(int i=0; i < stu.length; i++) {
			for(int j =0; j < stu[i].length; j++) {
				System.out.println(stu[i][j]);
			}
		}
		
	}
}
