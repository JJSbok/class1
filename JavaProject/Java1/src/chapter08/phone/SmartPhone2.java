package chapter08.phone;

public class SmartPhone2 extends Computer implements Phone {
	
	boolean power; // false
	@Override
	public void call() {
		// TODO Auto-generated method stub
		String number1 = String.valueOf(PHONE_NUM_1);
		String number2 = String.valueOf(PHONE_NUM_1);
		String number3 = String.valueOf(PHONE_NUM_9);
		System.out.println(number1+number2+number3+"에 전화를 겁니다");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		if(!power) { 
			power = true;
			
		}
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("전원을 끕니다.");
		
		if(power) {
			power = false;
		}
		SmartPhone2 phone2 = new SmartPhone2();
		
		phone2.turnOn();
		
		phone2.gamePlay();
		
		phone2.call();
		
		phone2.turnOff();
	}
}
