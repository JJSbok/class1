package chapter05;

public class modifierDefault {

	public String name; //public이 있어야 chapter05.other 다른 패키지에서 사용가능 default 값을 가지고 있으면 사용 할 수 없음 
	public int age;
	
	public void tell() {
		System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
	}
}
