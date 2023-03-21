package chapter02;

public class VarLongType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long num = 10000000000000000L;
		
		System.out.println(num);
	
		float num2 = 100.0f;
		
		System.out.println(num2);
		
		float num3 = 100;
		
		System.out.println(num3);
		
		float num4 = 1.23456789f;
		double num5 = 1.23456789;
		
		//대입 연산이 되면서 정밀한 데이터를 저장하지 못함.
		
		System.out.println(num4);
		System.out.println(num5);
		System.out.println("1.23456789");
	}

}
