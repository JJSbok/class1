package chapter10;

public class MyClass<T> {

	// 변수, 메소드의 반환타입, 매개변수의 타입
	
	T val;

	public MyClass(T val) {
		super();
		this.val = val;
 	}
	public MyClass() {
		
	}
 	T getVal() {
		return val;
	}
	
	void setVal(T val) {
		this.val = val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass<String> myClass = new MyClass<String>();
		myClass.setVal("KING"); //String 으로 지정했기 때문에 string 값만 들어올수 있음 / 잘못된 타입이 저장되지 않도록 처리가 됨
		System.out.println(myClass.getVal());
	}


	}


