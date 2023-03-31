package chapter07;

public class smartPhone2 extends inheritance {

	String model;
	// 상위클래스에 매개변수가 있는 생성자가 있다면 상위클래스의 맴버를 초기화 할 데이터를 받아서
	// 상위클래스의 생성자를 호출해주어야한다.
	//현재 클래스의 멤버를 초기화 한다.
	public smartPhone2(String phoneNumber, String model) {
		//상위 클래스의 생성자를 호출
		super(phoneNumber);
		//현재 클래스의 인스턴스 변수의 초기화
		this.model = model;
		// TODO Auto-generated constructor stub
	}

	void game() {
		super.call();
		System.out.println(model + "게임을 합니다");
	}
	public static void main(String[] args) {
		smartPhone2 sp2 = new smartPhone2("010-1111-2222", "IOS");
		
		sp2.game();
	}
}
