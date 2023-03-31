package chapter07;

public class inheritance {
	// 상위클래스의 정의
	// 상위 클래스는 넓은 의미를 가지고, 공통적인 변수나 메소드를 가지는 클래
	String phoneNumber;

	
	//생성자
	public inheritance(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	void call() {
		System.out.println(phoneNumber + "에서 전화를 걸어 통화를 합니다.");
	}

}
