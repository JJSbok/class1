package static_;

// 인스턴스가 생성될 때 만들어지는 변수가 아닌 처음 프로그램이 메모리에 로딩될 때 메모리를 할당
// 클래스 변수 정적변수라고도 함
// 인스턴스 생성과 상관업이 사용 가능하므로 클래스 이름으로 직접 참조
// 메모리를 계속 잡고 있는 것이기 때문에 사이즈가 큰 배열 같은 경우는 안쓰는게 좋을 것 같

// 싱글톤 패턴
// 프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴
// static 변수 , 메서드를 활용하여 구현 할 수 있음

public class Employee {

	public static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
