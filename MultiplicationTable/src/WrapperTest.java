
public class WrapperTest {
	
	public static void main(String[] args) {
		int myInt = 5316;
		System.out.println("myInt = "+ myInt); // 5316
		
		String myString = new Integer(myInt).toString();
		System.out.println("myString = "+ myString); // 5316
		
		myString = myString.replace('6', '4');
		
		float myFloat = Float.valueOf(myString).floatValue();
		System.out.println("myFloat = "+ myFloat); // 5314.0
	}
	
}
