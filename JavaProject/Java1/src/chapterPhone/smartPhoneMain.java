package chapterPhone;

import java.util.Date;

public class smartPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SmartPhone 클래스의 인스턴스를 만들어서 프로그램을 완성
		
		Date now = new Date();
		smartPhone sp1 = new smartPhone();
		System.out.println(sp1.color);
		System.out.println(sp1.size);
		System.out.println();
		
		smartPhone sp2 = new smartPhone();
		sp2.color = "RED";
		sp2.size = 4.0f;
		System.out.println(sp2.color);
		System.out.println(sp2.size);
		
		// sp1, sp2 참조변수 > 메모리 주소값을 가지는 변수
		
		sp1 = sp2;
		System.out.println();
		System.out.println(sp1.color);
		System.out.println(sp1.size);
		System.out.println(now);
		System.out.println();
		
		member member = new member("리사", "LALISA", 27, "010-3333-3333", sp2);
		printInfo(member);
	}
	static void printInfo (member member) {
		member.showData(); 
	}

}
