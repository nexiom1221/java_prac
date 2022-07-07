package ch16;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee employeeOh = new Employee();
		employeeOh.setEmployeeName("OH");
		System.out.println(employeeOh.serialNum);
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("KIM");
		employeeKim.serialNum++;
		
		System.out.println(employeeOh.serialNum);
		System.out.println(employeeKim.serialNum);
	
	}
}
