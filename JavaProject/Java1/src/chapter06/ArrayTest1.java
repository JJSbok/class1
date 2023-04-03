package chapter06;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] korScores = new int[10];

		// 배열 요소 초기
		korScores[0] = 68;
		korScores[1] = 65;
		korScores[2] = 86;
		korScores[3] = 91;
		korScores[4] = 63;
		korScores[5] = 42;
		korScores[6] = 52;
		korScores[7] = 77;
		korScores[8] = 99;
		korScores[9] = 76;
		
		int sum=0;
		float avg =0f;
		
		//배열은 반복문을 통해 일괄 처리가 가능
		for(int i=0; i<10; i++) {
			sum +=korScores[i];
		}
		
		System.out.println("국어 점수의 총합은 " +sum+ "점 입니다.");
		System.out.println("국어 점수의 총합은 " +sum/korScores.length+ "점 입니다.");
	}
}
