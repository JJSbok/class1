package instance;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentJang = new Student();
		studentJang.studentId = 201544098;
		studentJang.setStudentName("JangJongSoo");
		studentJang.address = "경기 일산서구";
		
		studentJang.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentId = 20160808;
		studentKim.setStudentName("KimJennie");
		studentKim.address = "서울 강남구";
		
		studentKim.showStudentInfo();
		System.out.println(studentJang); // studentJang이 자리잡은 가상의 주소값 
		System.out.println(studentKim);
	}

}
