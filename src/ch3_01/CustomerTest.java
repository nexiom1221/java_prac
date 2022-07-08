package ch3_01;

public class CustomerTest {
public static void main(String[] args) {
	Customer customerLee = new Customer(10010, "LeeSunShin");
	customerLee.bonusPoint = 10000;
	System.out.println(customerLee.showCustomerInfo());
	
	VipCustomer customerKim = new VipCustomer(10020,"KimYuShin");
	customerKim.bonusPoint = 10000;
	System.out.println(customerKim.showCustomerInfo());
	
	int priceLee = customerLee.calcPrice(10000);
	int priceKim = customerKim.calcPrice(10000);
	
	System.out.println(customerLee.showCustomerInfo() + "/" + priceLee);
	System.out.println(customerKim.showCustomerInfo() + "/" + priceKim);
	
	Customer customerNo = new VipCustomer(10030, "Na");
	customerNo.bonusPoint = 10000;
	int priceNo = customerNo.calcPrice(10000);
	
	System.out.println(customerNo.showCustomerInfo()+ priceNo);
}
}
