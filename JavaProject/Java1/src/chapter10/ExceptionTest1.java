package chapter10;

import java.util.Scanner;

public class ExceptionTest1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("프로그램을 시작 합니다.");
		System.out.println("첫번째 정수를 입력하세요.");
		
		int num1 = sc.nextInt();
		
		System.out.println("두번째 정수를 입력하세요.");
		int num2 = sc.nextInt();
		
		if(num2 ==0) {
			System.out.println("0으로 나눌순 없습니다.");
			return;	
		}
		sc.close();
		System.out.println(num1/num2);
		System.out.println("프로그램을 종료 합니다.");
		
		
	}

}
