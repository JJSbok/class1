package main;

import java.util.Scanner;

import controller.DeptListController;
import controller.DeptSearchController;

public class DeptManagerMain {

	public static Scanner sc = new Scanner(System.in); // controller 마다 스캐너를 계속 쓰면 효율적이지 못하니까 static 으로 밖으로 꺼내줌 
	
	public static void main(String[] args) {

		

		
		// Controller : View > Service > Dao > Service > Controller : View
		while (true) {
			System.out.println("메뉴를 입력하세요.");
			System.out.println("1. 부서 리스트 출력 ");
			System.out.println("2. 부서 검색");
			System.out.println("3. 부서 입력");
			System.out.println("4. 부서 수정");
			System.out.println("5. 부서 삭제");
			System.out.println("6. 프로그램 종료");
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				new DeptListController().getDeptList();
				break;
			case 2:
				new DeptSearchController().searchDept();
				break;
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
