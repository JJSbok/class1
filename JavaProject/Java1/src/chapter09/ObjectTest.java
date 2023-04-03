package chapter09;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1 = new Car("2023A001");
		Car c2 = new Car("2023B001");

		Car c3 = c1;

		Car c4 = new Car("2023A001");

		System.out.println(c1);
		System.out.println(c2.toString());
		System.out.println(c3);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4)); //형변환 없이 실행되면 결과값이 제대로 나오지 않기 때문에 override에서 형변환 
		System.out.println(c1.equals(null));
	}

}

class Car {

	String CarNo;

	Car(String CarNo) {
		this.CarNo = CarNo;

	}

	@Override
	public boolean equals(Object obj) {

		// obj > null = false
		Car car = null;
		if (obj != null && obj instanceof Car) {
			car = (Car) obj;
			// 문자열을 비교해서 같은지 여부 반환
			if (CarNo.equals(car.CarNo)) {
				return true;
			}
		}
		// obj > Car 타입으로 형변환 가능해야한다!
		// obj > 형변환 하고 carNo를 비교해서 결과값을 반환

		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return CarNo + " 차량입니다.";
	}

}
