// 실습1) 메인
public class InheritanceTest extends Manager{

	public InheritanceTest(String n, int s, String d) {
		super(n, s, d);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Manager mng = new Manager("홍길동", 10000000, "영업부");
		//Manager 클래스의 객체를 생성하고 이름,월급,부서를 인수로 전달
		
		mng.getInformation(); // Manager클래스의 getInformation()메소드 호출
	}

}
