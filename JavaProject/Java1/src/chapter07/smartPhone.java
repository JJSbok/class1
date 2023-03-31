package chapter07;

public class smartPhone extends inheritance {


	public smartPhone(String phoneNumber) {
		super(phoneNumber);
		// TODO Auto-generated constructor stub
	}

	//자식 클래스 : 좁은 의미, 기능의 확장
	String model;

	void game() {
		System.out.println(model + "게임을 합니다.");
	}
}
