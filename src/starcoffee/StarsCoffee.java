package starcoffee;

public class StarsCoffee {
	private Integer quantity;
//	private Integer volume;
//	private String item;
	
	public Beverage getCoffee(Integer i) {
		this.quantity = i;
		Beverage b = new Latte(quantity);
		return b;
		
	}
	
	public Beverage getTea(Integer i) {
		this.quantity = i;
		Beverage b = new GreenTea(quantity);
		return b;
		
	}
	
//	public void getItemname() {
//		this.itemname;
//	}
//	
//	public void setItemname(String itemname) {
//		this.item = itemname;
//	}
	
}
