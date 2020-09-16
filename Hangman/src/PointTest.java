
public class PointTest {

	public static void main(String[] args) {
		Point p = new Point(); // 정의된 Point 클래스는 new명령으로 생성해야 함
		p.x = 10; // Point 클래스의 멤버 변수 x에 저장
		p.y = 20; // Point 클래스의 멤버 변수 y에 저장
		p.printXY(); // Point 클래스의 printXY() 메소드 실행. x=10, y=20
	}
}

class Point{ // Point 클래스 정의
	int x;
	int y;
	
	public void printXY(){
		System.out.println("x="+x+", y="+y);
	}
}
