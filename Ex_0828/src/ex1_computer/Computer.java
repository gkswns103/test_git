package ex1_computer;

public class Computer {
	int ssd = 256;
	int ram = 128;
	float cpu = 2.4f;
	String color = "white";
	String brand = "apple";
	
	
	//public = 접근제한자 , void = 반환형 information() = 메서드명( 파라미터(인자) ){메서드의 실행 영역}
	public void infomation() {
		System.out.println("제조사: " + brand);
		System.out.println("ssd: " + ssd);
		System.out.println("ram: " + ram);
		System.out.println("cpu: " + cpu);
		System.out.println("색상: " + color);
		System.out.println("----------------");
	}
	
	//접근제한자의 종류
	// 1. public : 같은 프로젝트의 모든 클래스들에게 접근을 허용
	// 2. private : 현재 클래스에서만 접근을 허용
	// 3. protected : 상속 관계의 클래스에서만 접근을 허용
	// 4. default : 같은 패키지의 클래스들에게 접근을 허용
}
