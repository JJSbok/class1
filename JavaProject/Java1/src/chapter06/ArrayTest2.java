package chapter06;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열 인스턴스 생성
		int[] score = {100, 90, 70, 80, 65};
		int[] score2 = new int[] {100, 90, 70, 80, 65};
		int[] score3;
		score3=new int[]{100, 90, 70, 80, 65};
		
		System.out.println("배열 score1 ======");
		for (int i=0; i<score.length; i++) {
			System.out.print(score[i] + ", ");
		}	
		System.out.println();
		
		System.out.println("배열 score2 ======");
		for (int i=0; i<score2.length; i++) {
			System.out.print(score[i] + ", ");
			
		System.out.println();
		}
		
		
		System.out.println("배열 score3 ======");
		for (int i=0; i<score3.length; i++) {
			System.out.print(score[i] + ", ");
			
		System.out.println();
		}
	}

}
