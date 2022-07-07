package ch24;

public class StudentTest {
public static void main(String[] args) {
	
	Student studentLee = new Student(1001, "Lee ");
	
	studentLee.addSubject("kugo ", 100);
	studentLee.addSubject("sugaku ", 50);
	
	Student studentKim = new Student(1002, "Kim ");

	studentKim.addSubject("kugo ", 70);
	studentKim.addSubject("sugaku ", 85);
	studentKim.addSubject("eigo ", 100);
	
	studentLee.showStudentIofo();
	System.out.println("-------------------");
	studentKim.showStudentIofo();
}
}
