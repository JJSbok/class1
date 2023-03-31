package chapter07;

public class androidPhone extends inheritance {

	public androidPhone(String phoneNumber) {
		super(phoneNumber);
	}

	@Override
	void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println("안드로이드 폰으로 통화");
	}

}
