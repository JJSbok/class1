package chapter02;

public class ByteOverflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//다뤄야 하는 데이터의 범위에 따라 타입설저이 달라져야한다.
		//0~270
		
		byte b = 0; //byte형 변수 b를 선언하고 0으로 초기화.
		int i = 0;
		
		//0에서 1씩 더해서 270까지 증가시킴
		
		for(int x=0; x<=270; x++) {
			
			System.out.println("b=" + b + "\t" + "i=" + i );
			b++;
			i++;
			
		}
		
	}

}
