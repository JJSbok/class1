package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectInputStream inputStream = null;

		try {
			FileInputStream in = new FileInputStream("instanceData.ser");

			inputStream = new ObjectInputStream(in);

			Person p = (Person) inputStream.readObject();
			String newStr = (String) inputStream.readObject();

			p.tell();
			System.out.println(newStr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

		} catch (ClassNotFoundException e) {

		}

	}
}
