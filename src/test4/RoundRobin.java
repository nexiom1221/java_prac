package test4;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("input");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("next");
		
	}

}
