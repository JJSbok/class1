package chapter07;


	public class child extends parent {
		int num = 100;

		void showData() {
			System.out.println("상위 클래스 num = " + super.num);
			System.out.println("하위 클래스 num = " + this.num);
		}
	}
