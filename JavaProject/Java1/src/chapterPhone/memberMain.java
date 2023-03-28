package chapterPhone;

public class memberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		smartPhone smartPhone = new smartPhone();
	
		
		
		member member1 = new member("제니", "jennierubyjane", 28, "010-7777-7777", smartPhone);
		member member2 = new member("로제", "rosesarerosie");
		
		member1.showData();
		System.out.println();
		member2.showData();
		
		dataPrint(member1); //매개변수의 인자 > Member 타입의 인스턴스를 가르키는 주소 값
		dataPrint(member2);
	}
	static void dataPrint(member members) {
		//Member member : 매개변수 , 참조변수 
		members.showData();
	}

}
