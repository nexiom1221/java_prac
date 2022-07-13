package interface3_ch3.first;

public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("buy order");
	}
}
