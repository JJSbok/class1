package chapter11;


import java.util.TreeSet;

public class SmartPhoneTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<SmartPhone> phones= new TreeSet<SmartPhone>();
		
		
		phones.add(new SmartPhone("King", "1"));
		phones.add(new SmartPhone("Queen", "2"));
		phones.add(new SmartPhone("KQ", "3"));
		phones.add(new SmartPhone("QK", "4"));
		phones.add(new SmartPhone("King", "5"));
		
		for(SmartPhone ct : phones) {
			System.out.println(ct);
		}
	}

}
