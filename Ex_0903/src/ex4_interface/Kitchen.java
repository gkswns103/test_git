package ex4_interface;

// 인터페이스는 구현능력이 없으므로 다중구현이 가능하다
public class Kitchen implements Menu3{

	@Override
	public String jjajang() {
		return "춘장,중면";
	}
	
	@Override
	public String jjambbong() {
		return "각종해산물";
	}
	
	@Override
	public String tangsuyuck() {
		return "고기";
	}
	
	@Override
	public String boggembab() {
		return "밥";
	}
}
