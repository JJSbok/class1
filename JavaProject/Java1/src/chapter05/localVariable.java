package chapter05;

public class localVariable {
	void method(int num) {
		int lv = 10;

		if (num > 10) {
			boolean check = true;
			System.out.println(check);
		} else {
			boolean check = false;
			System.out.println(check);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		while (lv < 0) {
			int lv2 = 0;
			System.out.println(lv2);
		}
	}
}
