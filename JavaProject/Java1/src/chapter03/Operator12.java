package chapter03;

import java.util.Scanner;

public class Operator12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String gender = scanner.next();
		int age = scanner.nextInt();

		System.out.println("성별을 입력하세요 : " + gender);
		System.out.println("나이를 입력하세요 : " + age);

		if (gender == "남성" && age < 19) {
			System.out.println("입장하실수 없습니다. ");

			scanner.close();
		}

	}
}
