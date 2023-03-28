package chapterTest.test03;

import java.util.Scanner;

public class Calculator2 {

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int minus(int num1, int num2) {
		return num1 - num2;
	}

	public static int multipl(int num1, int num2) {
		return num1 * num2;
	}

	public static int div(int num1, int num2) {
		return num1 / num2;
	}

	public static double circum(float radius) {
		return radius * 2 * 3.14;
	}

	public static double circleArea(float radius) {
		return  radius * radius * 3.14;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.printf("첫번째 숫자를 입력하세요: ");
		int num1 = scanner.nextInt();

		System.out.printf("두번째 숫자를 입력하세요: ");
		int num2 = scanner.nextInt();

		System.out.printf("반지름을 입력하세요: ");
		float radius = scanner.nextFloat();


		System.out.println("더하기 : " + add(num1, num2));
		System.out.println("빼기 : " + minus(num1, num2));
		System.out.println("곱하기 : " + multipl(num1, num2));
		System.out.println("나누기 : " + div(num1, num2));

		System.out.println("원의 둘레 : " + circum(radius));
		System.out.println("원의 넓이 : " + circleArea(radius));

		scanner.close();

	}

}
