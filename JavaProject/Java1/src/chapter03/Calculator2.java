package chapter03;

import java.util.Scanner;

public class Calculator2 {

	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner scanner = new Scanner(System.in);
	
	int num1 = scanner.nextInt();
	int num2 = scanner.nextInt();
	float radius = scanner.nextFloat();
	
	System.out.printf("첫번째 숫자를 입력하세요: ");
	System.out.printf("두번째 숫자를 입력하세요: ");
	System.out.printf("반지름을 입력하세요: ");
	
//	int num1 = 10;
//	int num2 = 20;
//	float radius = 2.2f;
	
	System.out.println(num1+num2);
	System.out.println(num1-num2);
	System.out.println(num1*num2);
	System.out.println(num1/num2);
	
	System.out.println(radius*2*3.14);
	System.out.println(radius*radius*3.14);
	
	scanner.close();
	
	}

}

