package chapterTest.test09;

import java.util.Scanner;

public class Person {

	String name;
	String personNumber;

		public Person(String name, String personNumber) {
		super();
		this.name = name;
		this.personNumber = personNumber;
	}
		//1 .위 person클래스의 equals 메소드를 오버라이딩해서 주민번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다.
		
		Scanner sc = new Scanner(System.in);

		@Override
		public boolean equals(Object obj) {
			
			boolean result  = false;
			
			// 매개변수로 전달받은 obj를 person 타입으로 형변환(null 아닌 상태에서 형변환 여부
			// > personnumber 비교 > 결과값을 반환 > 결과값을 result에 대입
			
			if(obj != null && obj instanceof Person) {
				Person p = (Person)obj;
				result = this.personNumber.equals(p.personNumber);
			}
			return result;
			
			
		}

		public static void main(String[] args) {
			Person p1 = new Person("Jennie", "951111-2111111");
			Person p2 = new Person("Rose", "951111-2111111");
			System.out.println(p1.equals(p2));
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
	

}
