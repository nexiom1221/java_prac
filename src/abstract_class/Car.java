package abstract_class;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("run");
	}
	
	public void turnOff() {
		System.out.println("off");
	}
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
