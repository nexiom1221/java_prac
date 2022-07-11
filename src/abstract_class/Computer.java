package abstract_class;

public abstract class Computer {

	abstract void display();
	abstract void typing();
	
	public void turnOn() {
		System.out.println("turn on");
	}
	
	public void turnOff() {
		System.out.println("turn off");
	}
}
