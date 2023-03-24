package chapter04;

public class if5 {
	public static void main(String[] args) {
		int num = -100;

		if (num < 0) {
			System.out.println("0 미만");
		} else {
			switch ((num) / 100) {
			case 3:
				if (num < 0)
					;
				System.out.println("0미만");
				break;
			case 2:
				System.out.println("200 이상 300미만");
				break;
			case 1:
				System.out.println("100 이상 200미만");
				break;
			case 0:
				System.out.println("0 이상 100미만");
				break;
			default:
				System.out.println("300 이상");
				break;

			}
		}
	}
}
