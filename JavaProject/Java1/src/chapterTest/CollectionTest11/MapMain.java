package chapterTest.CollectionTest11;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, FootballPlayer> myTeam = new HashMap<>();
		
		myTeam.put(7, new FootballPlayer("son", 7, "tot", 30));
		
		FootballPlayer footballPlayer = myTeam.get(7);
		System.out.println(footballPlayer);
		
	}

}
