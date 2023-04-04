package chapter10;

public class ExceptionTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
			Class.forName("Example");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾지 못했습니다.");
			//내부 예외처리 하지 않고 호출한 쪽으로 전달	
		}
		
		int[] numbers = {1,2,3,4,5};
		try {
		System.out.println(numbers[5]);
 		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("없는거다.");
		}
	try {
		numbers = new int[-10];
		
	}catch(NegativeArraySizeException e){
		System.out.println("배열 생성시에는 배열의 사이즈가 음수이면 불가능이다.");
	}

	
String str = null;
try {
str.trim();
}catch(NullPointerException e) {
	System.out.println("널값 ㄴ");
}
}
}
