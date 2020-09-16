// 메소드를 static으로 선언하면 클래스 생성없이 바로 사용할 수 있다.
// static메소드에는 오직 static변수만을 사용한다.

public class StaticTest {

	public static void main(String[] args) {
		MyClass[] mc = new MyClass[10];
		
		for(int i=0;i<10;i++){
			mc[i] = new MyClass();
			System.out.println("MyClass Instance의 수: "+mc[0].getObjectNum()+"개");
		}
		System.out.println(MyClass.getObjectNum()); // 클래스명을 통하여 바로 사용가능
		
		/*
		System.out.println("mc[0] "+mc[0]+" mc[0].getObjectNum() "+mc[0].getObjectNum());
		System.out.println("mc[1] "+mc[1]+" mc[1].getObjectNum() "+mc[1].getObjectNum());
		System.out.println("mc[2] "+mc[2]+" mc[2].getObjectNum() "+mc[2].getObjectNum());
		System.out.println("mc[3] "+mc[3]+" mc[3].getObjectNum() "+mc[3].getObjectNum());
		// mc[0] MyClass@3d4eac69 mc[0].getObjectNum() 10
		// mc[1] MyClass@42a57993 mc[1].getObjectNum() 10
		// mc[2] MyClass@75b84c92 mc[2].getObjectNum() 10
		// mc[3] MyClass@6bc7c054 mc[3].getObjectNum() 10
		*/
	}

}

class MyClass{
	static int object_num = 0;
	
	public MyClass(){
		object_num++;
	}
	
	public static int getObjectNum(){
		return object_num;
	}
}
