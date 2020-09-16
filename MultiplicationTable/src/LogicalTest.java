
public class LogicalTest {

	public static void main(String[] args) {
		boolean x, y, z, b;
		
		x = false;
		y = z = true;
		b = x || y && z; // false or true and true, b = true (연산자 우선순위)
		System.out.println("x = "+ x +", y = "+ y +", z = "+ z +", b = "+ b);
	}

}
