package chapter05;

public class modifierProtected {
	protected String name; //같은 클래스 , 같은 패키지와 상속 관계의 하위 클래스에서 접근 가
	protected int age; 

	protected void tell() {
		System.out.println("안녕하세요 " + age + "살 " + name + " 입니다.");
	}
}
