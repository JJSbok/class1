package chapter05;

public class ex {

	static int height;
	static String name;
	int age;
	String address;
	
	public static void main(String[] args) {
		
		ex t1 = new ex();
		name = "김대원";
		t1.age = 27;
		t1.address = "부산";
		height = 165;
		System.out.println("T1의 정보");
		System.out.println("이름 : " + name + ", 나이 : " + t1.age);
		System.out.print(", 사는 곳 : " + t1.address + ", 키 : " + height + "\n");
		
		height = 176;
		name = "홍길동";
		System.out.println("변경된 키 : " + ex.height);
		System.out.println("변경된 이름 : " + name);
		
	}
}
