package starcoffee;

public class StarsCoffee {
	Integer quantity;
	
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
	
}
