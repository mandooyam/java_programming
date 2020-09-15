import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GameJava2_04 {

	public static void main(String[] args) throws IOException {
		 int x, y;
		 Random r = new Random();
		 
		 if(args.length==1){
			 x = Integer.valueOf(args[0]).intValue();
		 }else{
			 x = Math.abs(r.nextInt() % 9) + 1; // 1~9 랜덤 숫자
		 }
		 
		 y = Math.abs(r.nextInt() % 9) + 1;
		 
		 int num = x*y;
		 
		 System.out.println();
		 System.out.println("* 구구단 "+ x +"단에 대한 문제입니다.");
		 System.out.println();
		 
		 System.out.print(x +" * "+ y +" = ");
		 
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 String user;
		 user = in.readLine(); // readLine() 데이터를 라인 단위로 읽을 수 있다. String으로 반환.
		 
		 int inputNum = new Integer(user).intValue();
		 
		 if(num==inputNum){
			 System.out.println("맞았습니다!");
		 }else{
			 System.out.println("틀렸습니다. 정답은 "+num+"입니다.");
		 }
	}

}
