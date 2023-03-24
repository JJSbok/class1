package chapter04;

public class if16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		for (i = 1; i < 100; i++) {
			sum += i;

		}
		System.out.println(sum);

		sum = 0;
		i = 0;
		while (i < 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);

		sum = 0;
		i = 0;

		do {

			sum += i;
			i++;

		} while (i < 100);
		System.out.println(sum);

	}

}
