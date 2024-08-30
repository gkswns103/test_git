package ex4_constructor;

public class Pen {
	
	private String company;
	private int price;
	private String color;
	
	public Pen( String color ) {
		this.color = color;
	}
	
	public Pen() {		
		this.company =  "monami";
		this.price = 500;
		this.color = "black";
	}	
	
	public String getCompany() {
		return company;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}
	
	
}
