package interface3_ch3.first;

public interface Sell {

	void sell();
	
	default void order() {
		System.out.println("sell order");
	}
}
