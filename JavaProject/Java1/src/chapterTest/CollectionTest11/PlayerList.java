package chapterTest.CollectionTest11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FootballPlayer p = new FootballPlayer();

		p.setName("Neymar");
		p.setNumber(10);
		p.setTeam("Paris-saintGermain");
		p.setAge(32);

		ArrayList<FootballPlayer> playerList = new ArrayList<FootballPlayer>();

		playerList.add(p);

		p = new FootballPlayer();
		p.setName("Mbappe");
		p.setNumber(7);
		p.setTeam("Paris-saintGermain");
		p.setAge(26);
		playerList.add(p);

		System.out.println(playerList.size());

		for (int i = 0; i < playerList.size(); i++) {
			System.out.println(playerList.get(i).getName());
			System.out.println(playerList.get(i).getNumber());
			System.out.println(playerList.get(i).getTeam());
			System.out.println(playerList.get(i).getAge());
			System.out.println("-------------------------");
		}

		//playerList.remove(0); // 삭제
		playerList.add(new FootballPlayer("Messi", 30, "Paris-saintGermain", 30)); // 추가
		for (FootballPlayer Py : playerList) {
			System.out.println(Py.toString());
		}
		
		//------------------------------
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		p.name = sc.next();
		System.out.println("번호 : ");
		p.number = sc.nextInt();
		System.out.println("팀 : ");
		p.team = sc.next();
		System.out.println("나이 : ");
		p.age = sc.nextInt();

		playerList.add(new FootballPlayer(p.name, p.number, p.team, p.age));

		for (FootballPlayer Py : playerList) {
			System.out.println(Py.toString());

		}
	}
}