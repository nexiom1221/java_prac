package ch3_01;

import java.util.ArrayList;

public class CustomerTest {
public static void main(String[] args) {
	
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	Customer customerLee = new Customer(10010, "Lee");
	Customer customerShin = new Customer(10020, "Shim");
	Customer customerHong = new GoldCustomer(10030, "Hong");
	Customer customerYul = new GoldCustomer(10040, "Lee2");
	Customer customerKim = new VipCustomer(10050, "Kim", 12345);
	
	customerList.add(customerLee);
	customerList.add(customerShin);
	customerList.add(customerHong);
	customerList.add(customerYul);
	customerList.add(customerKim);

	System.out.println("--------Information--------");
	
	for ( Customer customer : customerList) {
		System.out.println(customer.showCustomerInfo());
	}
	
	
	System.out.println("====== discount and point =======");
	
	int pirce = 10000;
	
	for( Customer customer : customerList) {
		int cost = customer.calcPrice(pirce);
		System.out.println(customer.getCustomerName() + " " + cost);
		System.out.println(customer.getCustomerName() + " bouns is " + customer.bonusPoint);
		
	}
	
//	
//	Customer customerLee = new Customer(10010, "LeeSunShin");
//	customerLee.bonusPoint = 10000;
//	System.out.println(customerLee.showCustomerInfo());
//	
//	VipCustomer customerKim = new VipCustomer(10020,"KimYuShin");
//	customerKim.bonusPoint = 10000;
//	System.out.println(customerKim.showCustomerInfo());
//	
//	int priceLee = customerLee.calcPrice(10000);
//	int priceKim = customerKim.calcPrice(10000);
//	
//	System.out.println(customerLee.showCustomerInfo() + "/" + priceLee);
//	System.out.println(customerKim.showCustomerInfo() + "/" + priceKim);
//	
//	Customer customerNo = new VipCustomer(10030, "Na");
//	customerNo.bonusPoint = 10000;
//	int priceNo = customerNo.calcPrice(10000);
//	
//	System.out.println(customerNo.showCustomerInfo()+ priceNo);
	
}
}

