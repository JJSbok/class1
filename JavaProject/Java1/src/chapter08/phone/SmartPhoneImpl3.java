package chapter08.phone;

public class SmartPhoneImpl3 implements Phone, Application{

	boolean power;

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화 통화를 합니다.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("전원을 끕니다.");	
	}

	@Override
	public void appRun() {
		// TODO Auto-generated method stub
		System.out.println("앱을 실행합니다.");
	}

	@Override
	public void appStop() {
		// TODO Auto-generated method stub
		System.out.println("앱을 종료합니다.");
	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		
	}
	
}
