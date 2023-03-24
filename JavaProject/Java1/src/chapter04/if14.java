package chapter04;

public class if14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		int dep = 0;
		int det = 0;
		int sum = 0;
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				dep = (i * 10) + j;
				det = (j * 10) + i;
				sum = dep + det;
				if (sum == 99)
					System.out.println(dep + "\n" + det + "\n" + "----------" + "\n" + sum);
			}
		}
	}
}
