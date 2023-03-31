package chapter07;

public class iPhone extends inheritance {

	public iPhone(String phoneNumber) {
		super(phoneNumber);
	}

	@Override
	void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println("아이폰으로 통화합니다.");
	}

}
