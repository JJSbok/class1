
public class test3 {
	public static void main(String[] args) {
		
		
		
		hello();
		hello2("제니");
		//기능 : 인사말을 출력하는 기능을 가지는 메소드
		//매개변수 : 데이터 받는 정의 > 데이터 필요 없음!
		//결과 반환 : 반환이 없음 !
		//반환타입 메소드이름(매개변수){}
		//void  반환 값이 없을 때 사용 > return 값이 없음 
			
		
	}
	static void hello() {
		System.out.println("안녕하세요!");
		System.out.println("반갑습니다.");
	
}
	//이름을 전달받아 이름과 인사말을 출력하는 메소드
	//매개변수 : 이름 (문자열)
	//반환 : 없음 
	static void hello2(String name) {
		System.out.println(name);
		System.out.println("안녕하세요");
}
}
