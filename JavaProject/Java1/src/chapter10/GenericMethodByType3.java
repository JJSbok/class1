package chapter10;

import chapter08.Phone;
import chapterPhone.smartPhone;

public class GenericMethodByType3 {

	public <T extends Phone> void introduce(T t) {
		System.out.println("안녕하세요 . " + t.toString());
	}
	
	public static void main(String[] args) {
		GenericMethodByType3 byType = new GenericMethodByType3();
		
		
		
//		byType.<String>introduce("Jennie");
//		byType.<Integer>introduce(20);
//		byType.introduce("1");
//		byType.introduce(true);
		}
}
