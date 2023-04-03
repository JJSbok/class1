package project;

import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.println("전화번호를 입력하세요 : ");
		String num = sc.next();
		
		System.out.println("이메일을 입력하세요 : ");
		String email = sc.next();
		
		System.out.println("주소를 입력하세요 : ");
		String address = sc.next();
		
		System.out.println("생일을 입력하세요 : ");
		String birthday = sc.next();
		
		System.out.println("그룹을 입력하세요 : ");
		String group = sc.next();
		
		Contact contact = new Contact(name,num,email,address,birthday,group);
		
		contact.showData();
		
	}

}
