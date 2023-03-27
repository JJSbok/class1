package chapter05;

public class memberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		member member1 = new member("제니", "jennierubyjane", 28, "010-7777-7777");
		member member2 = new member("로제", "rosesarerosie");
		
		member1.showData();
		System.out.println();
		member2.showData();
	}

}
