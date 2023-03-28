package chapter05;

public class singleton {

	// 다른 클래스에서 singleton 클래스를 이용해서 인스턴스 생성을 막는다!

	private singleton() {
	}
		// 내부에서 singleton 클래스로 인스턴스 생
		private static singleton s = new singleton();

		// 내부에서 만들어진 참조값을 외부에서 사용할 수 있도록 참조값을 반환 해주는 메소드 
		
		public static singleton getInstance() {
			if(s == null) {
				s = new singleton();
			}
			return s;
		}
		public void printData() {
			System.out.println("데이터를 출력합니다.");
		}
}
