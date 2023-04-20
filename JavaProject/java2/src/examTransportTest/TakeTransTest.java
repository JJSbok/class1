package examTransportTest;

public class TakeTransTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentJ = new Student("Jennie", 5000);
		Student studentQ = new Student("Eunwoo", 10000);
		Student studentR = new Student("Rose", 7000);
		Student studentE = new Student("Jisoo", 20000);
		Student studentL = new Student("Lisa", 15000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		Taxi taxi = new Taxi("잘 간다 운수택시");
		
		studentE.takeTaxi(taxi);
		studentJ.takeBus(bus100);
		studentR.takeBus(bus100);
		studentL.takeTaxi(taxi);
		
		Subway greenSubway = new Subway(2);
		studentQ.takeSubway(greenSubway);
		
		studentJ.showStudentInfo();
		studentQ.showStudentInfo();
		studentR.showStudentInfo();
		studentE.showStudentInfo();
		studentL.showStudentInfo();
		
		bus100.showBusInfo();
		greenSubway.showBusInfo();
		taxi.showTaxiInfo();
	}

}
