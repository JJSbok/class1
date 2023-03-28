package chapter05;

public class singletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		singleton s = singleton.getInstance();

		 // 외부에서 인스턴스 생성이 불가 ! because >> private로 작성했기 때문 
		s.printData();
		
		singleton s1 =singleton.getInstance();
		singleton s2 =singleton.getInstance();
	}
}
