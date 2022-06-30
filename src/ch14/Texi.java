package ch14;

public class Texi {

	String texiName;
	int money;
	int texiCount;
	
	public Texi(String texiName) {
		this.texiName = texiName;
	}
	
	public void take(int money) {
		this.money = money;
		texiCount++;
	}
	
	public void showTexiInfo() {
		System.out.println(texiName +" income is "+ money);
	}
}
