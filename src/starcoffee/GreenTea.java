package starcoffee;

public class GreenTea extends Tea{
	private String teaName;
	
	public GreenTea(String n) {
		this.teaName = n;
	}
	
	public GreenTea(Integer i){
		System.out.println("GreenTea");
		System.out.println("You have seleted: "+i);
	}
}
