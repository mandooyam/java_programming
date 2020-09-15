
public class CallByValueTest2 {
	static int a;
	static int b;
	
	public static void main(String[] args) {
		a = 10;
		b = 20;
		
		System.out.println("swap() 메소드 호출 전: "+ a +", "+ b); // 10, 20
		swap();
		System.out.println("swap() 메소드 호출 후: "+ a +", "+ b); // 20, 10
	}

	public static void swap() {
		int temp = a;
		a = b;
		b = temp;
	}

}
