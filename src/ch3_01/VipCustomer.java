package ch3_01;

public class VipCustomer extends Customer {

	protected int agentId;
	double salesRatio;
    protected int price;
	
	public VipCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() call");
	}
	
	public int getAgentId() {
		return agentId;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " member number is " + agentId;
	}
}
