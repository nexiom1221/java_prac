package test3;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("running");
	}

	@Override
	public void jump() {
		System.out.println("jumping");
		
	}

	@Override
	public void turn() {
		System.out.println("turning");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*************Super*************");
		
	}
}
