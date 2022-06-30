package ch12;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("noName", 1);
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Lee";
		p.age = 25;
		
		Person p2 = p.getPerson();
		System.out.println(p2);
		
		
		System.out.println(p);
		
		
	}
}
