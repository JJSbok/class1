package chapterTest.test07;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Male m1 = new Male("정해인","871111-1000000", "배우입니다." );
		m1.printGreeting();
		
		Person p1 = (Person)m1;
		p1.printGreeting();
		
		
		
		Person p2 = new Female("제니", "061111-4000000");
		p2.printGreeting();
	}

}
