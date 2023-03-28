package chapterTest.test05;

import java.util.Scanner;

public class contactMain3 {

public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("전화번호 정보를 입력하세요.");
	
	System.out.println("이름 > ");
	String name = in.nextLine();
	
	System.out.println("전화번호 > ");
	String number = in.nextLine();
	
	System.out.println("이메일 > ");
	String email = in.nextLine();
	
	System.out.println("주소 > ");
	String address = in.nextLine();
	
	System.out.println("생일 > ");
	String birthday = in.nextLine();
	
	System.out.println("그룹 > ");
	String group = in.nextLine();
	
	//인스턴스 생성
	contact ct = new contact(name, number, email, address, birthday, group);
	
	System.out.println("입력 결과 ---------------");
	
	// 인스턴스의 출력 메소드
	ct.printSimpleData();
	
	System.out.println();
	
	// 인스턴스의 출력 메소드 
	ct.printData();
}
}
