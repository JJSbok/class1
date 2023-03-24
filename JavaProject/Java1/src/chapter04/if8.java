package chapter04;

public class if8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int sum = 0;
		while (num <= 1000) {
			if (num % 2 == 0 || num % 7 == 0) {
				sum += num;
			}
			num++;

		}
		System.out.println(sum);

	}

}
