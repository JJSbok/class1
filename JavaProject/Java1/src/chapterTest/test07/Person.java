package chapterTest.test07;

public class Person {

	// 1. 이름을 저장하는 변수 ,주민등록번호를 저장하는 변수
	private String name;
	private String personNum;
	
	
	public Person(String name, String personNum) {
		super();
		this.name = name;
		this.personNum = personNum;
	}

	//2. 인사하는 메소드를 정의
	public void printGreeting() {
		System.out.println("안녕하세요. 저는 "+ name + "입니다." +getAge() +"살 입니다");
	}
	
	//주민번호를 통해서 나이를 계산해서 반환 메소드
	int getAge() {
		int age = 0;
		//01234567890101112
		//991111-1000000
		String year = personNum.substring(0,2); //substring 문자열 자르기
		char gender = personNum.charAt(7); //String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해줌
		
		
//		System.out.println(year + ":" + gender);
		
		int personYear = 0;
		
		if (gender<'3') {
			//1900+year
			age =2023- (1900 + Integer.parseInt(year)) + 1; 
		}else {
			age =2023- 2000- Integer.parseInt(year) + 1;
			
		}
//		age = 2023 - personYear;
		
		return age;
	}
	
	public static void main(String[] args) {
		Person p = new Person("tester", "970202-1212121");
		
		System.out.println(p.getAge());
		p.getAge();
		
		
	}
}
