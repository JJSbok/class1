package chapter08;

public class AbstractMain {

	public static void main(String[] args) {
		
		AbstractClass abstractClass;
		// TODO Auto-generated method stub
//		AbstractClass m = new AbstractClass(); //참조변수 선언, 상위 타입 추상클래스로 인스턴스 생성을 할 수 없
		AbstractClass n = new NewClass();
		n.abstractMethod();
		n.instanceMethod();
		n.printData();
	}

}
