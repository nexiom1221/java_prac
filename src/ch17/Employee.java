package ch17;

public class Employee {

	private static int serialNum = 1000;
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Employee.serialNum = serialNum;
	}
	
	public static void main(String[] args) {
		System.out.println(Employee.getSerialNum());
	}
	
}
