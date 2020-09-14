import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GameJava2_03 {

	public static void main(String[] args) throws IOException {
		// 0 ~ 2 사이의 난수를 구한다.
		Random r = new Random();
		int computer = Math.abs(r.nextInt()%3);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String user;
		System.out.println("가위, 바위, 보 중 하나를 선택하세요. (가위=a, 바위=b, 보=c): ");
		user = in.readLine();
		
		// user a:가위, b:바위, c:보
		// computer 0:가위, 1:바위, 2:보
		if(user.equals("a")) {
			if(computer==0) System.out.println("무승부 (컴퓨터:가위, 사람:가위)");
			if(computer==1) System.out.println("컴퓨터 승! (컴퓨터:바위, 사람:가위)");
			if(computer==2) System.out.println("사람 승! (컴퓨터:보, 사람:가위)");
		}else if(user.equals("b")) {
			if(computer==0) System.out.println("사람 승! (컴퓨터:가위, 사람:바위)");
			if(computer==1) System.out.println("무승부 (컴퓨터:바위, 사람:바위)");
			if(computer==2) System.out.println("컴퓨터 승! (컴퓨터:보, 사람:바위)");
		}else if(user.equals("c")) {
			if(computer==0) System.out.println("컴퓨터 승! (컴퓨터:가위, 사람:보)");
			if(computer==1) System.out.println("사람 승! (컴퓨터:바위, 사람:보)");
			if(computer==2) System.out.println("무승부 (컴퓨터:보, 사람:보)");
		}
	}

}
