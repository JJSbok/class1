package chapter10;

public class GenericMethodByType2 {

	public <T> void introduce(T t) {
		System.out.println("안녕하세요 . " + t.toString());
	}
	
	public static void main(String[] args) {
		GenericMethodByType2 byType = new GenericMethodByType2();
		
		byType.<String>introduce("Jennie");
		byType.<Integer>introduce(20);
		byType.introduce("1");
		byType.introduce(true);
		}
}
