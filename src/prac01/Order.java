package prac01;

public class Order {
	public int orderNumber;
	public int phoneNumber;
	public String address;
	public int date;
	public int time;
	public int price;
	public int menuNumber;

	public void showInfo() {
		System.out.println("주문접수 번호 : "+orderNumber);
		System.out.println("주문 핸드폰 번호 : "+phoneNumber);
		System.out.println("주문 집 주소 : "+address);
		System.out.println("주문 날짜 : "+date);
		System.out.println("주문 시간 : "+time);
		System.out.println("주문 가격 : "+price);
		System.out.println("메뉴 번호 : "+menuNumber);
		
	}
	

}