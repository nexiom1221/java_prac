package ch09;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("korea",100);
		studentLee.setMathSubject("math",100);

		Student studentKim = new Student(95,"Kim");
		studentKim.setKoreaSubject("korea ", 80);
		studentKim.setMathSubject("math", 85);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}
}
