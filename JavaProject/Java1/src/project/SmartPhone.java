package project;

import java.util.Scanner;

public class SmartPhone {

	private Contact[] contacts; // null
	private int numOfContact; // 입력된 정보의 개수 , 배열의 index 값으로 사용
	Scanner sc = new Scanner(System.in);

	private SmartPhone(int size) { // 초기화에 필요한 데이터 받기 위해 매개변수 정의한 생성자
		contacts = new Contact[size]; // 인스턴스 변수들 초기화
		numOfContact = 0;

	}
//new SmartPhone(100); 100개 만들수 있음 

	private static SmartPhone sp = new SmartPhone(10);

//static으로 미리 만들어 getInstance()는 최초에 할당된 하나의 메모리를 계속 쓰는 방식이다.
	public static SmartPhone getInstance() {
		if (sp == null)
			sp = new SmartPhone(10);
		return sp;

	}

}
