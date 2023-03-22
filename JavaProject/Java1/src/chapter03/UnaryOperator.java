package chapter03;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 30;
		
		System.out.println(num1++);
		System.out.println(++num1);
		System.out.println(num1--);
		System.out.println(--num1);
		System.out.println(num1++ + ++num1);
		
		byte num2 = 10;
		byte num3 = 20;
		
		byte num4 = (byte)(num2 +num3);
		
		System.out.println(num4);
	}

}
