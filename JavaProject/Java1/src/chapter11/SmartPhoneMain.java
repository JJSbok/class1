package chapter11;

import java.util.HashSet;

public class SmartPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<SmartPhone> phones= new HashSet<SmartPhone>();
		
		
		phones.add(new SmartPhone("King", "010-2222-2222"));
		phones.add(new SmartPhone("Queen", "010-2222-2222"));
		phones.add(new SmartPhone("KQ", "010-2222-2222"));
		phones.add(new SmartPhone("QK", "010-2222-2222"));
		phones.add(new SmartPhone("King", "010-2222-2222"));
		
		for(SmartPhone ct : phones) {
			System.out.println(ct);
		}
	}

}
