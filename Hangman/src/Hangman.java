import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 글자를 맞추지 못하면 교수형되어 간다
// 숨겨진 문자열은 hiddenString="hello"

public class Hangman {
	String hiddenString;
	StringBuffer outputString;
	StringBuffer inputString;
	int remainder;
	int failed;
	
	public Hangman(){ // 생성자
		hiddenString = "hello"; // hiddenString=hello
	}
	
	public int playGame() throws IOException{
		outputString = new StringBuffer();
		
		for(int i=0;i<hiddenString.length();i++){
			outputString.append('-'); // outputString=-----
		}
		
		inputString = new StringBuffer(); // inputString=입력한 값을 저장하기 위함
		
		remainder = hiddenString.length(); // remainder=5
		failed=0;
		
		System.out.println("단어("+hiddenString.length()+"글자"+"):"+outputString);
		drawMan(); // 출력
		
		do{
			checkChar(readChar()); // 235line readChar()에서 1글자를 리턴받아
			System.out.println("\n단어("+hiddenString.length()+"글자"+"):"+outputString);
			drawMan(); // 출력
		}while((remainder>0)&&(failed<6)); // 남은 횟수가 0이거나 failed 6번 이상일 때까지
		return failed;
	}
	
	public void checkChar(char guess){
		boolean already = false;
		for(int i=0;i<inputString.length();i++){
			if(inputString.charAt(i)==guess){
				System.out.println("이미 입력한 문자입니다! 다시 입력해주세요.");
				already = true;
			}
		}
		
		if(!already){ // 입력한 적이 없으면
			
			inputString.append(guess); // inputString=1글자 추가
			
			boolean success = false;
			for(int i=0;i<hiddenString.length();i++){ // hiddenString=hello
				if(hiddenString.charAt(i)==guess){ // 숨은글자hello와 1글자씩 비교
					outputString.setCharAt(i, guess); // outputString의 i자리에 저장
					remainder--; // 남은횟수감소(5,4,3,2,1)
					success = true;
				}
			}
			if(!success) failed++; // 동일문자가 없어 실패시 failed증가(1,2
		}
	}
	
	public void drawMan(){
		System.out.println("  ┌────┐");
		System.out.println("  │    │");
		
		switch(failed){
		case 0:
			System.out.println("       │");
			System.out.println("       │");
			System.out.println("       │");
			System.out.println("       │");
			System.out.println("       │");
			System.out.println("       │");
			break;
		case 1: // 1번 실패한 경우 머리그림
			System.out.println("  ○    │");
			System.out.println("       │");
			System.out.println("       │");
			System.out.println("       │");
			System.out.println("       │");
			System.out.println("       │");
			break;
		case 2: // 2번 실패한 경우 외팔 그림
			System.out.println("  ○    │");
			System.out.println(" ┌┼    │");
			System.out.println("       │");
			System.out.println("       │");
			System.out.println("       │");
			System.out.println("       │");
			break;
		case 3: // 3번 실패한 경우 몸통 그림
			System.out.println("  ○    │");
			System.out.println(" ┌┼    │");
			System.out.println("  │    │");
			System.out.println("       │");
			System.out.println("       │");
			System.out.println("       │");
			break;
		case 4: // 4번 실패한 경우 오른쪽 그림
			System.out.println("  ○    │");
			System.out.println(" ┌┼┐   │");
			System.out.println("  │    │");
			System.out.println("       │");
			System.out.println("       │");
			System.out.println("       │");
			break;
		case 5: // 5번 실패한 경우 왼쪽다리 그림
			System.out.println("  ○    │");
			System.out.println(" ┌┼┐   │");
			System.out.println("  │    │");
			System.out.println(" ┌┘    │");
			System.out.println(" │     │");
			System.out.println("       │");
			break;
		case 6: // 6번 실패한 경우 오른쪽다리 그림
			System.out.println("  ○    │");
			System.out.println(" ┌┼┐   │");
			System.out.println("  │    │");
			System.out.println(" ┌┴┐   │");
			System.out.println(" │ │   │");
			System.out.println("       │");
			break;
		}
	}
	
	public char readChar() throws IOException{ // 문자열 입력받아도 1글자 리턴
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String user;
		
		System.out.print("1문자를 입력하세요: ");
		user = in.readLine(); // 키보드로 한줄을 입력
		return user.charAt(0); // 입력받은 문자열 중 첫번째 문자를 반환
	}
}
