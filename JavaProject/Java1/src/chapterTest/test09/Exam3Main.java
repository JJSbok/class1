package chapterTest.test09;

import java.util.Scanner;

public class Exam3Main {

	// 사용자에게 이름을 입력 받아 입력 받은 문자열을 정상적인 문자열의 이름으로 표현하는지 판별하고
	// 공백으로 입력되었는지도 판별하는 프로그램 String trim*( +

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요 : > ");
		String name = sc.nextLine();

		if (name.trim().isEmpty()) {
			System.out.println("공백입력은 혀용하지 않습니다.");

		} else {
			System.out.println(name);
		}
	}

	// 전달받은 문자열이 영문자로 되어있는지 판별 : a~z A~Z 0~9
	boolean checkName(String name) {
		boolean result = true;
		// 전달받은 문자열중에 영문자가 아닌 문자를 포함하고 있다면

		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'))
				result = false;
			break;
		}
		return result;
	}
}
