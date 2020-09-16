
public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append('R'); // char형
		sb.append("ealty "); // String형
		sb.append(2007); // int형
		sb.append(' ');
		sb.append(7.5);
		System.out.println(sb);
		sb.insert(6, ", B"); // String형
		sb.insert(9, 'C'); // char형
		System.out.println(sb);
	}

}
