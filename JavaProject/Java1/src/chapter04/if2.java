package chapter04;

public class if2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 100;

		if (num < 0) {
			System.out.println("0미만");
		} else if (0 <= num && num < 100) {
			System.out.println("0이상 100미만");
		} else if (100 <= num && num < 200) {
			System.out.println("100이상 200미만");
		} else if (200 <= num && num < 300) {
			System.out.println("200이상 300미만");
		} else if (3000 <= num) {
			System.out.println("300이상");
		}
	}
}
