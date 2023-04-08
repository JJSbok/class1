package chapter12;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class SerializableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person("King", 20);
		String msg = "안녕하세요 ~";
		
		try {
			ObjectOutputStream outputStream = null;
			FileOutputStream fos = new FileOutputStream("instanceData.ser");
			outputStream = new ObjectOutputStream(fos);
			outputStream.writeObject(person);
			outputStream.writeObject(msg);
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

}
