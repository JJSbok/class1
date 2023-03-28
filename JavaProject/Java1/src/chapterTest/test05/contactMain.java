package chapterTest.test05;

import java.util.Scanner;

public class contactMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("이름 : ");
		String name = scanner.next();

		System.out.printf("전화번호 : ");
		String number = scanner.next();

		System.out.printf("이메일 : ");
		String email = scanner.next();

		System.out.printf("주소 : ");
		String address = scanner.next();

		System.out.printf("생일 : ");
		String birthday = scanner.next();

		System.out.printf("그룹 : ");
		String group = scanner.next();
		
		contact ct = new contact(name, number, email, address, birthday, group);
		
		ct.printData();
		
		
		scanner.close();
		
		

	}

}
