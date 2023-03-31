package chapterTest.test08;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 : ");
		long num1 = sc.nextLong();
		
		System.out.println("두번째 숫자 : ");
		long num2 = sc.nextLong();
		
		sc.close();
		
		Calculate c = new Calculate();
		System.out.println(c.add(num1, num2));
		System.out.println(c.substract(num1, num2));
		System.out.println(c.multiply(num1, num2));
		System.out.println(c.divide(num1, num2));
	}

}
