import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class GameJava2_02 {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy년 MM월 dd일의 ");
		System.out.print(dateForm.format(today));
		
		Random r = new Random();
		int randomNum = Math.abs(r.nextInt()%100)+1; //1 ~ 100 랜덤
		System.out.println("금전운(100): "+ randomNum +"%");
	}

}
