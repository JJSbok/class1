package chapter05;

public class member {
//변수
	String name;
	String email;
	int age;
	String phoneNumber;

	
	//Generate Constructor using Field 항목 클릭 시 자동 생
	public member(String name, String email, int age, String phoneNumber) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public member(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		this.age = 20;
		this.phoneNumber = "입력데이터가 없습니다";
	}
	void showData() {
		System.out.println("이름 : " + name);
		System.out.println("이메일 : " + email);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + phoneNumber);
	}
}
