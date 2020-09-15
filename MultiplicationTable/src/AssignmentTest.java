
public class AssignmentTest {

	public static void main(String[] args) {
		int x, y, z;
		
		x = y = z = 1;
		z += x + y; // x=1, y=1, z=3
		System.out.println("x = "+ x +", y = "+ y +", z = "+ z);
		
		x += y -= z = 5; // x=-3, y=-4, z=5
		System.out.println("x = "+ x +", y = "+ y +", z = "+ z);
	}

}
