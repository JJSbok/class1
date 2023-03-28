package chapterTest.test05;




//④ main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력
public class Member {
	
	//① 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
	private String name;
	private String number;
	private String major;
	private String grade;
	private String email;
	private String birthday;
	private String address;

	//② 위에서 정의한 정보를 출력하는 메소드 정의
	public void printData() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + number);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("이메일 : " + email);
//		if(birthday != null) {
//			System.out.println("생일 : " + birthday); //null
//		}else {
//			System.out.println("생일 : " + "미입력");
//			
//		}
//		if(address != null) {
//			System.out.println("주소 : " + address); //null
//		}else {
//			System.out.println("주소 : " + "미입력"); //null
//		}
		
		System.out.println("생일 : " + (birthday != null ? birthday : "미입력")); //삼항연산 위에 if문과 같음 
		System.out.println("주소 : " + (address != null ? address : "미입력")); //삼항연산 위에 if문과 같음 
	}
	//③ 모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의 //생성자 오버로딩	
	public Member(String name, String number, String major, String grade, String email, String birthday, String address) {
		super();
		this.name = name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}

	//③ 모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의 //생성자 오버로딩 
	//generate constructor using field 클릭하면 자동 생성
	public Member(String name, String number, String major, String grade, String email) {
		super();
		this.name = name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.email = email;
	}

	public static void main(String[] args) {
		Member mb1 = new Member("제니",
				"010-0000-0000",
				"아이돌",
				"senior",
				"Jennierubyjane",
				"19960000",
				"seoul");
		Member mb2 = new Member("로제",
				"010-0000-0000",
				"아이돌",
				"junior",
				"rosesarerosie");
		
		mb1.printData();
		System.out.println();
		mb2.printData();
	}
	
}
