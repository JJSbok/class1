package chapter12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
public class BufferedInputStreamTest {

	public static void main(String[] args) {

		// 원본 파일 : 파일 데이터를 읽어와야한다.
		// 복사본 : 원파일의 데이터를 써야한다.

		try {
			InputStream in = new FileInputStream("/Users/jsj/Documents/Test/eclipse.dmg");
			// 필터스트림 사용 시에는 기본스트림이 필요
			BufferedInputStream bin = new BufferedInputStream(in);
			OutputStream out = new FileOutputStream("/Users/jsj/Documents/Test/eclipse1.dmg");
			BufferedOutputStream bout = new BufferedOutputStream(out);
			int byteData = 0;
			
			while(true) {
				byteData = bin.read(); // 마지막은 -1
			if(byteData==-1) {
				break;
			}
			// 새로운 파일에 데이터를 쓴다! 
			bout.write(byteData);
		
		}	
		in.close();
		out.close();
		
			System.out.println("복사가 완료 되었습니다.");
		}catch (IOException e){

	}

}
}



