package ch04;

public class StudentTest {
	
	public static void main(String[] args) {
		Student studentLee = new Student();
		
		studentLee.studentId = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "seoul";
		
		studentLee.showStudentInfo();
		
		
		Student studentKim = new Student();
		
		studentKim.studentId = 123456;
		studentKim.setStudentName("Kim");
		studentKim.address = "seoul";
		
		studentKim.showStudentInfo();
				
		
	}
	
}
