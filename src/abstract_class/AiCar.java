package abstract_class;

public class AiCar extends Car {

	@Override
	public void drive() {
		System.out.println("auto driving");
		System.out.println("auto drift");
	}
	
	@Override
	public void stop() {
		System.out.println("auto brake");
	}
}
