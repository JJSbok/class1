package chapter05;

public class classVariable {
	
	static String name = "KING";
	static int age = 10;
	
	void tellName() {
		System.out.println("나의 이름은 " + name + "입니다.");
	}
	void tellAge() {
		System.out.println("나이는 " + age + "살 입니다.");
	}
	public static void main(String[] args) {
		System.out.println(age);
		System.out.println("나이는 " + age + "살 입니다.");
		classVariable cv =new classVariable();
		cv.tellName();
	}
}
