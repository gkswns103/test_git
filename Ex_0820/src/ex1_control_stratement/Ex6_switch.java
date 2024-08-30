package ex1_control_stratement;

public class Ex6_switch {
	public static void main(String[] args) {
	
		String last_name = "최";
		
		switch(last_name) {
		case "김":
			System.out.println("21%");
			break;
		case "이":
			System.out.println("14%");
			break;
		case "박":
			System.out.println("8%");
			break;
		case "최":
			System.out.println("4%");
			break;
		default:
			System.out.println("똑바로 입력해 새캬");
			break;
		}
		
	}
}
