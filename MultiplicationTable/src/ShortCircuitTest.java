
public class ShortCircuitTest {

	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		
		if((++a>3)&&(++b>8)) { // false
			System.out.println("if문이 수행되었습니다.");
		}
		/*if()
		 * ( 1 %% 2 ) : 1이 거짓이면 2는 수행X
		 * ( 1 || 2 ) : 1이 참이면 2는 수행X
		 */
		
		System.out.println("a : "+ a +", b : "+ b); // a : 3, b : 4
	}

}
