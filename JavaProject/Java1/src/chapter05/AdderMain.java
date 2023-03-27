package chapter05;

public class AdderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder adder = new Adder();
		
		adder.add(10,100);
		
		System.out.println(adder.add(10, 20));
		System.out.println(adder.add(10.0f, 20.0f));
	}

}
