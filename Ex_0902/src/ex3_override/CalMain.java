package ex3_override;

public class CalMain {

	public static void main(String[] args) {
		
		 Plus p = new Plus();
		 System.out.println(p.getResult(10, 20));
		 
		 Minus m = new Minus();
		 System.out.println(m.getResult(10, 5));
		 
	}
	
}
