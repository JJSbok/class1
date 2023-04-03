package project;

public class Contact {
	String name;
	String num;
	String email;
	String address;
	String birthday;
	String group;

	public Contact(String name, String num, String email, String address, String birthday, String group) {
		super();
		this.name = name;
		this.num = num;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	public void showData()
	{
		System.out.println("이름 : " +name);
		System.out.println("전화번호 : " +num);
		System.out.println("이메일 : " +email);
		System.out.println("주소 : " +address);
		System.out.println("생일 : " +birthday);
		System.out.println("그룹 : " +group);
		
	}

}
