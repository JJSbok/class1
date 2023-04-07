package chapter11;

import java.util.Objects;

public class SmartPhone implements Comparable<SmartPhone> {

	String name;
	String phoneNumber;

	public SmartPhone(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SmartPhone other = (SmartPhone) obj;
		return Objects.equals(name, other.name) && Objects.equals(phoneNumber, other.phoneNumber);
	}
	
	@Override
	public String toString() {
		return "SmartPhone [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

	@Override
	public int compareTo(SmartPhone o) {
		// TODO Auto-generated method stub

		return name.compareTo(o.getName());
	}
}


