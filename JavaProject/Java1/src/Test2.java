
public class Test2 {

	//정수 두개를 받아 매개변수를 선언
	//더하기 연산 내부처리
	//결과를 반환하는 메소드 > return 결과값;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long result = add (100, 200);
		System.out.println(result);
		
		addPrint(10, 11);
		int resultValue = plus(10,20);
		
		System.out.println(resultValue);
		
	}

	public static long add(long n1, long n2) {
		long result = n1 + n2;
		return result;
		
	}
	
	public static void addPrint(long n1, long n2) {
		long result = n1 + n2;
		System.out.println(result);
	}
	
	static int plus(int num1, int num2) {
		int ans;
		ans= num1 +num2;
		//결과 값 변환
		return ans;
		
		
	
}
}
