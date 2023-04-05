package chapter10;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> players = null;
		
		players = new ArrayList<String>();
		
		players.add("Jennie");
		players.add("Rose");
		players.add(new String("Jisoo"));
		
		System.out.println("index-1 위치의 데이터 : " + players.get(0));
		System.out.println("index-1 위치의 데이터 : " + players.get(1));
		System.out.println("index-1 위치의 데이터 : " + players.get(2));
		
		players.add(1, new String("Lisa"));
		System.out.println("index-1 위치에 새로운 데이터 입력 ");
		System.out.println("index-1 위치의 데이터 : " + players.get(0));
		System.out.println("index-1 위치의 데이터 : " + players.get(1)); //1 위치에 새로 추가 됐으므로 뒤에 데이터는 한칸씩 물러남 
		System.out.println("index-1 위치의 데이터 : " + players.get(2));
		System.out.println("index-1 위치의 데이터 : " + players.get(3));
		
		System.out.println("모든 플레이어는 " + players.size() + "명 입니다.");
		
		

	}

}
