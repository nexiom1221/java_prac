package interface3_ch3.first;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("customer sell");
	}
	
	@Override
	public void buy() {
		System.out.println("customer buy");
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
	
	@Override
	public void order() {
		System.out.println("customer order");
	}
}
