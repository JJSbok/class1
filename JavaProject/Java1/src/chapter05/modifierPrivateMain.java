package chapter05;

public class modifierPrivateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
modifierPraivate mp = new modifierPraivate("제니", 20);


//mp.name = "제니";
//mp.age = 28; private으로 접근제어자를 선언해서 사용할 수 없음
mp.tell();
	}

}
