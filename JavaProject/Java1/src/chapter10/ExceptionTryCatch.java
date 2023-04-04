package chapter10;

import java.util.Scanner;

public class ExceptionTryCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두개를 입력해주세요.");
		System.out.println("정수 1 : ");
		int num1 = sc.nextInt();

		System.out.println("정수 2 : ");
		int num2 = sc.nextInt();

		try {
			System.out.println("num1/num2 = " + (num1 / num2));
		} catch (ArithmeticException e) {
			System.out.println("0으론 나눌수 없습니다.");
			System.out.println("프로그램을 종료합니다.");
			System.out.println(e.getMessage()); // 발생한 예외의 메시지 문자열을 반환
			e.printStackTrace(); // 발생한 예외클래스이름과 메시지, 호출 메소드의 실행 순서를 출력 
		}
	}

}
