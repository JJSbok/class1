package chapter09;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int num = (int)(Math.random()*10)+1; 
		//random은 double 만 사용하지만 뒷부분에 괄호 int껴주심 가능 0~0.999999999 > 0~0.99999 > 0~9 > 1~10
		//System.out.println(num);
		
		for(int i=0; i<6; i++) {
			int num = (int)(Math.random()*45)+1;
			System.out.println(num);
		}
			
	}

}
