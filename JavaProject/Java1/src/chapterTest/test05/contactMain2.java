package chapterTest.test05;

import java.util.Scanner;

public class contactMain2 {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("나이를 입력하세요");
	
	String strAge = in.nextLine();
	
	int age = Integer.parseInt(strAge); //parseInt() 문자열 String타입의 숫자를 int타입으로 변환해줌
	//int뿐만 아니라 byte, short, long, float, double 등 숫자와 관련된 타입은 전부 가능 
	
	System.out.println(strAge);
	
	if(age>19) {
		System.out.println("성인!");
	}else {
		System.out.println("미성년자!");
	}
	
	in.close();
}
}
