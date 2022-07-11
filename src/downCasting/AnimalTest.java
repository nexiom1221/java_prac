package downCasting;

import java.util.ArrayList;

public class AnimalTest {

	public void testDownCasting(ArrayList<Animal> list) {
		for(int i=0; i<list.size(); i++) {
			Animal animal = list.get(i);
		
		if (animal instanceof Human) {
			Human human = (Human)animal;
			human.readBooks();
		}
		
		else if (animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}
		
		else if (animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.flying();
		}
		
		else {
			System.out.println("error");
		}
		
		}
	}
	
	
	
//	public static void main(String[] args) {
//
//		Animal hAnimal = new Human();
//		Animal tAnimal = new Tiger();
//		Animal eAnimal = new Eagle();
//		
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
//		
//		ArrayList<Animal> animalList = new ArrayList<Animal>();
//	
//		animalList.add(hAnimal);
//		animalList.add(tAnimal);
//		animalList.add(eAnimal);
//		
//		for(Animal animal : animalList) {
//			animal.move();
//		}
//	}	
//	
//	public void moveAnimal(Animal animal) {
//		animal.move();
//		
//	}

}
