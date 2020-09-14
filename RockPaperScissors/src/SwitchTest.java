
public class SwitchTest {

	public static void main(String[] args) {
		int num = 2;
		
		switch(num) {
		case 1:
			System.out.println("결과는 1입니다.");
			break;
		case 2:
		case 3:
			System.out.println("결과는 2 또는 3입니다.");
			break;
		default:
			System.out.println("결과는 1, 2, 3이 아닙니다.");
			break;
		}
	}

}
