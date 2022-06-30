package ch14;

public class TakeTransTest {
public static void main(String[] args) {
	
	Student studentJ = new Student("James", 5000);
	Student studentT = new Student("Tomas", 10000);
	Student studentE = new Student("Edward", 20000);
	
	Bus bus100 = new Bus(100);
	
	Subway subwayGreen = new Subway(2);
	
	studentJ.takeBus(bus100);
	studentT.takeSubway(subwayGreen);
	
	studentJ.showInfo();
	studentT.showInfo();
	
	bus100.showBusInfo();
	subwayGreen.showSubwayInfo();


	Texi jal = new Texi("jal");

	studentE.takeTexi(jal);

	jal.showTexiInfo();
	studentE.showInfo();

}
}
