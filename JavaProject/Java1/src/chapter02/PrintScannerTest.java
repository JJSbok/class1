package chapter02;

import java.util.Scanner;

public class PrintScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("이름을 입력하세요 >> ");
		String name = in.nextLine();
		System.out.println("안녕하세요 " + name + "님. 반갑습니다. ");
		in.close();

	}

}
