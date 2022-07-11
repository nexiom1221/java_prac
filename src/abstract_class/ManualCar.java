package abstract_class;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("driving");
		System.out.println("people driveng");
	}
	
	@Override
	public void stop() {
		System.out.println("brake");
	}
}
