package chapter10;

public class MyInterfaceImpl<T1, T2> implements MyInterface<T1, T2> {

	@Override
	public T1 method1(T1 t) {
		// TODO Auto-generated method stub
		return t;
	}

	@Override
	public T2 method2(T2 t) {
		// TODO Auto-generated method stub
		return t;
	}
public static void main(String[] args) {
	
	MyInterfaceImpl<String, Integer> my  = null; // 메소드 안에서는 my는 지역변수라 초기화가 필요(null) 
	// my = new MyInterfaceImpl<String, Integer>();
	my = new MyInterfaceImpl();
	
	System.out.println(my.method1("Ten"));
	System.out.println(my.method2(10));
	
}
}
