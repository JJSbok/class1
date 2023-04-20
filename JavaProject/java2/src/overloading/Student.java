package overloading;

// 여러가지 생성자를 정의하는 생성자 오버로딩

public class Student {

	public int height;
	public int weight;
	public String gender;
	public String name;
	public int age;
	
	public void showStudentInfo() {
		System.out.println("키가" + height + "이고 몸무게가 " + weight + "킬로인 " + gender +"이 있습니다." +
	"이름은 " + name + "이고" + "나이는 " + age + "입니다.");
	}
}
