package chapter12;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "String";
		char ch = 'A';
		char[] charArr = {'B','C'};
	FileWriter out;
	try {
		out = new FileWriter("/Users/jsj/Documents/Test/test-test.txt");
		out.write(str);
		out.write(ch);
		out.write(charArr);
		
		out.close();
		System.out.println("파일에 문자열을 입력.");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
