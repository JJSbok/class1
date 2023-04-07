package chapter12;

import java.io.FileInputStream;
import java.io.IOException;

public class fileInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream in = new FileInputStream("/Users/jsj/Documents/Test/first.txt");
			int i = in.read();
			System.out.println(i);
			System.out.println((char) i);
			in.close();
			System.out.println("파일 데잍터를 모두 읽었습니다.");
		}catch(IOException e){
			System.out.println("파일이 존재하지 않습니다.");
			
		}
	}
	
}
