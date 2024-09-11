package ex3_work;


public class Work {

	private String name;
	private int age;
	private String tell;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getTell() {
		return tell;
	}



	public void setTell(String tell) {
		this.tell = tell;
	}



	public void showMenu() { // 메뉴 프린트
		System.out.println("1.정보추가");
		System.out.println("2.정보삭제");
		System.out.println("3.전체정보");
		System.out.println("etc.종 료");
		System.out.print(">> ");
	}
	
}

