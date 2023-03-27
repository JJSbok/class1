package chapter05;

public class classMethod {

	int iv = 10; //인스턴스 변수
	static int cv = 30; // 클래스 변수
	
	//인스턴스 메소드
	void printNumber1() {
		System.out.println(iv);
		System.out.println(cv);
	}
	static void printNumber2() {
		System.out.println("Class Method");
//		System.out.println(iv); 오류 / 인스턴스 변수는 클래스 메소드 내에서 실행할 수 없음 
		classMethod cm = new classMethod(); // 객체를 생성해야 사용가능 
		System.out.println(cm.iv); 
		System.out.println(cv);
	}
	
	
	public static void main(String[] args) {
		//클래스 메소드의 호출 :클래스이름.메소드이름()
		classMethod.printNumber2();
		
	}
}
