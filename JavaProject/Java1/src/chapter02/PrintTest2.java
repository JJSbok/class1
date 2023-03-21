package chapter02;

public class PrintTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "JAVA";
		System.out.print("안녕하세요. 저는 ");
		System.out.print(name);
		System.out.print("입니다.");
		System.out.println();
		System.out.printf("안녕하세요. 저는 %s입니다. \n" ,"JAVA");
		System.out.printf("안녕하세요. 저는 %s입니다. \n" ,name);
		System.out.printf("저는 %d살 입니다. " , 20);
		System.out.printf("정수 : %d 실수 : %f", 10,13.5);
		System.out.printf("문자 : %c 문자열 : %s", 'Z' , "KING");
		
		System.out.print("\n줄바꿈 \n연습\n");
	}

}
