package chapter07;

public class smartPhoneImpl extends inheritance {

	String model;

	public smartPhoneImpl(String phoneNumber, String model) {
		super(phoneNumber);
		// TODO Auto-generated constructor stub
		this.model = model;
	}

	@Override
	void call() {
		super.call();
		System.out.println("에어팟을 이용해서 통화를 합니다");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartPhoneImpl spi = new smartPhoneImpl("010-2323-2323", "android");
		spi.call();

	}

}
