package chapterPhone;

public class member {
//변수
	String name;
	String email;
	int age;
	String phoneNumber;
	smartPhone phone;
	

	
	//Generate Constructor using Field 항목 클릭 시 자동 생
	public member(String name, String email, int age, String phoneNumber, smartPhone phone) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.phone = phone;
	
	}

	public member(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		this.age = 20;
		this.phoneNumber = "입력데이터가 없습니다";
		this.phone = new smartPhone();
	}
	void showData() {
		System.out.println("이름 : " + name);
		System.out.println("이메일 : " + email);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + phoneNumber);
		this.phone.call();
		System.out.println();
	}
}
