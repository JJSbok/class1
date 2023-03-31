package chapterTest.test07;

public class Male extends Person{

	String msg;
	
	public Male(String name, String personNum , String msg) {
		super(name, personNum);
		this.msg = msg;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void printGreeting() {
		// TODO Auto-generated method stub
		super.printGreeting();
	}

	void hello() {
		System.out.println("안녕하세요~");
		
	}
	
	

}
