
public class ContinueTest {

	public static void main(String[] args) {
		int i = 0;
		
		while(i<10){
			i++;
			if(i%2==0) continue; // 짝수인 경우에는 이동
			System.out.println(i); // 1, 3, 5, 7, 9
		}
	}

}
