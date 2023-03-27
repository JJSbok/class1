package chapter05;

public class smartPhoneS {

	String color;
	float size;
	int volume;

	// 생성자 :초기화 메소드, 인스턴스 변수의 초기화 작업
	// 초기화 작업이 없는 경우 생략가능
	// 아래와 같은 생성자 > 기본 생성자
	smartPhoneS(String color, float size, int volume) {
		this.color = color; // this = 자신의 객체를 가르키는 참조변수
		this.size = size;
		this.volume = volume;

	}
	
	smartPhoneS(String color, float size){
		this(color, size, 0); // this(); 다른 생성자를 호출
//		this.color = color;
//		this.size = size;
//		this.volume = 0;
	}
	
	smartPhoneS(){
		this("WHITE", 4.2f, 3);
//		color = "White";
//		size = 4.2f;
//		volume = 3;
	}

	void call() {
		System.out.println("전화 걸기!");
	}

	void volumeUp() {
		volume++;
	}

	void volumeDown() {
		volume--;
	}

	public static void main(String[] args) {
		
		// smartPhoneS sp = new smartPhoneS("RED", 10.0f, 23); // 오버로딩을 통해 사용 가능 2개 부르면 2개 사
		smartPhoneS sp1 = new smartPhoneS("RED", 10.0f, 23); //생성자 command 키 누르고 가르키면 해당 위치로 이동해줌 
		smartPhoneS sp2 = new smartPhoneS("BLUE", 32.0f);
		smartPhoneS sp3 = new smartPhoneS();
		System.out.println(sp1.color);
		System.out.println(sp1.size);
		System.out.println(sp1.volume);
		System.out.println();
		
		System.out.println(sp2.color);
		System.out.println(sp2.size);
		System.out.println(sp2.volume);
		System.out.println();
		
		System.out.println(sp3.color);
		System.out.println(sp3.size);
		System.out.println(sp3.volume);
		System.out.println();
//		sp.call();
	}
}
