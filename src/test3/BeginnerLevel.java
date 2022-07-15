package test3;

public class BeginnerLevel extends PlayerLevel {
	
	@Override
	public void run() {
		System.out.println("running");
	}

	@Override
	public void jump() {
		System.out.println("cant jump");
		
	}

	@Override
	public void turn() {
		System.out.println("cant turn");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*************Beginnner*************");
		
	}
	
	
}

