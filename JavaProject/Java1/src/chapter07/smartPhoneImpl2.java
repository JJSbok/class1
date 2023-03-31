package chapter07;

public class smartPhoneImpl2 extends inheritance {

	String model;

	public smartPhoneImpl2(String phoneNumber, String model) {
		super(phoneNumber);
		// TODO Auto-generated constructor stub
		this.model = model;
	}

	@Override
	void call() {
		super.call();
		System.out.println(model + "에어팟을 이용해서 통화를 합니다");
	}

	void playMusic() { //상위 클래스에 없기 때문에 override 없이 하위클래스 인스턴스를 생성해서 실행
		System.out.println("How you like that이 플레이됩니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartPhoneImpl2 spi = new smartPhoneImpl2("010-2323-2323", "android");
		spi.call();

		// 다형성 : 상위타입의 참조변수에 다양한 하위타입의 인스턴스를 참조할수 있는것
		inheritance p = new smartPhoneImpl2("010-2222-2222", "IOS");
		p.call(); // 하위 타입 인스턴스에 정의되어 있는 오버라이딩된 call() 호출된다!

		smartPhoneImpl2 p2 = new smartPhoneImpl2("ooo", "test");

		smartPhoneImpl2 p3 = (smartPhoneImpl2)p;
		p3.playMusic();
		p2.playMusic();
	}

}
