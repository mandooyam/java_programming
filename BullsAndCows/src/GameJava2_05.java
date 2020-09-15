import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GameJava2_05 {

	public static void main(String[] args) throws IOException {
		int result;
		
		if(args.length==3){ // 인수가 있는 경우
			int x = Integer.valueOf(args[0]).intValue();
			int y = Integer.valueOf(args[1]).intValue();
			int z = Integer.valueOf(args[2]).intValue();
			
			result = playGame(x, y, z);
		}else{ // 인수가 없는 경우
			result = playGame(); // playGame()에서 난수 발생하도록
		}
		
		System.out.println();
		if(result<=2){ // 문제를 푼 횟수에 따라 칭찬메시지 출력
			System.out.println("참 잘했어요!");
		}else if(result<=5){
			System.out.println("잘했어요!");
		}else if(result<=9){
			System.out.println("보통이네요!");
		}else{
			System.out.println("분발하세요!");
		}
	}

	public static int playGame() throws IOException {
		int x, y, z;
		Random r = new Random();
		x = Math.abs(r.nextInt() % 9) + 1; // 1~9 랜덤 숫자
		
		do{
			y = Math.abs(r.nextInt() % 9) + 1; // 1~9 랜덤 숫자
		}while(y==x); // 같지 않을 때까지 난수 발생
		
		do{
			z = Math.abs(r.nextInt() % 9) + 1; // 1~9 랜덤 숫자
		}while((z==x)||(z==y)); // 같지 않을 때까지 난수 발생
		
		/*System.out.println(x +", "+ y +", "+ z);*/
		
		return playGame(x, y, z);
	}

	public static int playGame(int x, int y, int z) throws IOException {
		int count; // 문제를 푼 횟수
		int strike, ball;
		
		int[] usr = new int[3]; // 사용자가 입력한 숫자 3개
		int[] com = { x, y, z }; // 컴퓨터가 숨긴 숫자 3개
		
		System.out.println("숫자 야구 게임");
		
		count = 0;
		
		do{
			count++;
			do{
				System.out.println("\n카운트: "+count);
				
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				String user;
				
				System.out.print("1번째 숫자: ");
				user = in.readLine(); // 키보드로부터 1번째 수 입력
				usr[0] = new Integer(user).intValue(); // 입력받은 문자를 int형 숫자로 변환
				
				System.out.print("2번째 숫자: ");
				user = in.readLine(); // 키보드로부터 2번째 수 입력
				usr[1] = new Integer(user).intValue(); 
				
				System.out.print("3번째 숫자: ");
				user = in.readLine(); // 키보드로부터 3번째 수 입력
				usr[2] = new Integer(user).intValue(); 
				
				if((usr[0]==0)||(usr[1]==0)||(usr[2]==0)){
					System.out.println("0은 입력하지 마세요. 다시 입력해주세요.");
				}else if((usr[0]>9)||(usr[1]>9)||(usr[2]>9)){
					System.out.println("1부터 9까지의 숫자 중 하나를 입력해주세요. 다시 입력해주세요.");
				}else if((usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2])){
					System.out.println("모두 다른 숫자를 입력해주세요. 다시 입력해주세요.");
				}
			}while((usr[0]==0)||(usr[1]==0)||(usr[2]==0)||
					(usr[0]>9)||(usr[1]>9)||(usr[2]>9)||
					(usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2]));
			// 입력받은 답에 이상이 없을 때까지 반복
			
			strike = ball = 0;
			
			if(usr[0]==com[0]) strike++;
			if(usr[1]==com[1]) strike++;
			if(usr[2]==com[2]) strike++;
			
			if(usr[0]==com[1]) ball++;
			if(usr[0]==com[2]) ball++;
			if(usr[1]==com[0]) ball++;
			if(usr[1]==com[2]) ball++;
			if(usr[2]==com[0]) ball++;
			if(usr[2]==com[1]) ball++;
			
			System.out.println("Strike: "+ strike +" Ball: "+ ball); // 볼카운트 출력
		}while((strike<3)&&(count<11)); // 답을 맞췄거나 10번이상 시도할때까지 반복
		
		return count;
	}

}
