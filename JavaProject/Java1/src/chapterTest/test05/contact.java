package chapterTest.test05;

public class contact {
	private String name;
	private String number;
	private String email;
	private String address;
	private String birthday;
	private String group;

	public contact(String name, String number, String email, String address, String birthday, String group) {
		this.name = name;
		this.number = number;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
	}
//	public static class contact() {
//		String name;
//		String number;
//		String email;
//		String address;
//		int birthday;
//		String group;	
//	
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthDay() {
		return birthday;
	}

	public void setBirthDay(String birthDay) {
		this.birthday = birthDay;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void printSimpleData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + number);
	}
	public void printData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + number);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + address);
		System.out.println("생일 : " + birthday);
		System.out.println("그룹 : " + group);
		
	}

}
