package chapter12;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			FileOutputStream fout = new FileOutputStream("/Users/jsj/Documents/Test/first.txt");
			fout.write(65);
			fout.close(); // i/o에서는 스트림 사용 후 반드시 닫아준다!!! 닫지 않으면 성능저하 할 수 있고 웹에서는 종료 대기해서 입출력 장애가 올 수 잇음
			System.out.println("파일에 데이터 쓰기 성공!");
			
		}catch(IOException e){
			System.out.println();
			
		}
	}

}
