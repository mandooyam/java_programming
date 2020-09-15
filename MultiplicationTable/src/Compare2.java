
public class Compare2 {

	public static void main(String[] args) {
		Integer x = new Integer(100);
		Integer y = new Integer(100);
		
		if(x.equals(y)){
			System.out.println(x+" == "+y);
		}else{
			System.out.println(x+" != "+y);
		}
		// 100 == 100
		/* equals()는 메소드. 객체끼리 내용 비교. 대상의 내용 자체를 비교.
		 * == 연산자. 주소값을 비교.
		 */
	}

}
