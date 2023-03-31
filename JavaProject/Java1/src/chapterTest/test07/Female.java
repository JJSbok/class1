package chapterTest.test07;

public class Female extends Person {

	private String msg;
	
	public Female(String name, String personNum) {
		super(name, personNum);
		this.msg = "안녕!";
		
		
		// TODO Auto-generated constructor stub
	}

	public Female(String name, String personNum, String msg) {
		super(name, personNum);
		this.msg = msg;
	}

	@Override
	public void printGreeting() {
		// TODO Auto-generated method stub
		super.printGreeting();
		System.out.println(msg);
	}

	
}
