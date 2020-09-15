
public class CallByReferenceTest {

	public static void main(String[] args) {
		Number n = new Number();
		n.x = 10;
		n.y = 20;
		
		System.out.println("swap() 메소드 호출 전: "+ n.x +", "+ n.y); // 10, 20
		swap(n);
		System.out.println("swap() 메소드 호출 후: "+ n.x +", "+ n.y); // 20, 10
	}

	public static void swap(Number z) {
		int temp = z.x;
		z.x = z.y;
		z.y = temp;
	}

}

class Number{
	public int x;
	public int y;
}
