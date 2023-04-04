package chapterTest.test10;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("아이디를 입력해주세요 : ");

		String id =sc.next();
		for(int i=0; i<id.length(); i++) {
			
		char a = id.charAt(i);
		int asc = (int)a;
		
		
		try {
			if(!(asc >96 && asc<123 || asc>47 && asc<58)){
				BadInputException e = new BadInputException();
				throw e;
			}
		}catch (BadInputException e) {
			e.printStackTrace();
		}
		}
	}}
	
		

