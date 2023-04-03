package chapter09;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "String";
		String str2 = "String";
		String str3 = new String("String");

		System.out.println(str1 == str2);
		System.out.println(str2 == str3);

		System.out.println("str1.equals(str3) = " + str1.equals(str3));

		// 특정 타입의 데이터를 >string 타입으로 변경
		String str4 = "" + 1;
		String str5 = String.valueOf(1);
		String str6 = new String();
		System.out.println(str5.toString());
		System.out.println();

		String str = "Hello~";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		System.out.println(str.length());

		// index : 0 ~ str.length() -1

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();
		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();
		System.out.println("------------------------------");
		// compareTo
		System.out.println(str.compareTo("Hello~"));
		System.out.println(str.compareTo("Hello~~"));
		System.out.println(str.compareTo("Hello"));
		System.out.println("------------------------------");
		// 문자열에 특정 문자열을 포함여부 확인 > boolean
		System.out.println(str.contains("H"));

		String file1 = "phone.jpg";
		String file2 = "iava.pdf";
		System.out.println("------------------------------");
		if (file1.endsWith(".jpg") || file1.endsWith(".png")) {
			System.out.println("업로드가 가능합니다.");
		} else {
			System.out.println("확장자가 .jpg인 파일만 업로드가 가능합니다.");
		}

		//equals > 저장하고 있는 문자열을 비교
		System.out.println("------------------------------");
		System.out.println(str.equals("hello"));
		System.out.println(str.equals("hello~"));

		
		// 문자열의 사이즈 체크 : isEmpty() >str.length() ==0 
		System.out.println("------------------------------");
		System.out.println(str.isEmpty());
		System.out.println("".isEmpty());
		
		//문자열의 개수 및 바꾸기 
		System.out.println("------------------------------");
		System.out.println(str.length());
		System.out.println(str);
		System.out.println(str.replace('~', '!'));
		System.out.println(str.replace("Hello", "JAVA"));
		
		// 시작하는 문자열 체크 
		System.out.println("------------------------------");
		String url = "http://localhost:80/member/login.jsp";
		System.out.println(url.startsWith("http://"));
		String domain = "http://localhost:80/";
		
		System.out.println(url.substring(7)); //index 순서
		System.out.println(url.substring(domain.length()));
		
		//trim 공백 제거 
		System.out.println("------------------------------");
		String str7 = "     Hello     JAVA     ";
		System.out.println(str7);
		System.out.println(str7.trim());
		
	}

}
