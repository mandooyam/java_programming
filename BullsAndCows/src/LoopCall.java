
public class LoopCall {

	public static void main(String[] args) {
		System.out.println("power(2,1) : "+ power(2,1)); // 2
		System.out.println("power(2,2) : "+ power(2,2)); // 4
		System.out.println("power(2,3) : "+ power(2,3)); // 8
		System.out.println("power(2,4) : "+ power(2,4)); // 16
		System.out.println("power(2,5) : "+ power(2,5)); // 32
	}

	public static int power(int x, int y) {
		int sum = 1;
		
		while(y>0){
			sum = sum * x; // x를 y번 곱함
			y--;
		}
		return sum;
	}

}
