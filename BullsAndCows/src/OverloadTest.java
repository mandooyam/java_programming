
public class OverloadTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(max(a,b)); // 20
		
		double c = 10.5;
		double d = 20.5;
		System.out.println(max(c,d)); // 20.5
	}

	public static double max(double x, double y) {
		if(x>y){
			return x;
		}else{
			return y;
		}
	}

	public static int max(int x, int y) {
		if(x>y){
			return x;
		}else{
			return y;
		}
	}

}
