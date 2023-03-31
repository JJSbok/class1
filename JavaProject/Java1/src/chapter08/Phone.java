package chapter08;

public abstract class Phone {
	String PhoneNumber;

	public Phone(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	void call() {
		System.out.println(PhoneNumber + "에게 전화를 걸어 통화를 합니다 ");
	}

	abstract void turnOn();
}
