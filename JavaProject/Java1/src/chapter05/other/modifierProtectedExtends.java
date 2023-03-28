package chapter05.other;

import chapter05.modifierProtected;

public class modifierProtectedExtends extends modifierProtected {

	// name, age, tell()

	public static void main(String[] args) {
		modifierProtectedExtends mpe = new modifierProtectedExtends();

		mpe.name = "지수";
		mpe.age = 27;
		
		mpe.tell();
	}
}
