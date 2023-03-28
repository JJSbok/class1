package chapterTest.test05;

public class contact {
	private String name;
	private String number;
	private String email;
	private String address;
	private int birthday;
	private String group;

	public contact(String name, String number, String email, String address, int birthday, String group) {
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

	public int getBirthDay() {
		return birthday;
	}

	public void setBirthDay(int birthDay) {
		this.birthday = birthDay;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void showData() {
		System.out.println("연락처" +  "\n"+ name + "\n" + number + "\n" + email + "\n" + address + "\n" + birthday + "\n" + group);
	}
}
