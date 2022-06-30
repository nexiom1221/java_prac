package ch04;

public class Student {
	public int studentId;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentId + " name is "+ studentName+ " address is "+address);
		
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}
	

}

 