// super,this 연습
public class SubClass extends SuperClass{
	public void print(){
		System.out.println("서브클래스");
	}
	
	public void callSuperThis(){
		super.print(); // SuperClass클래스의 print() 메소드
		this.print(); // SubClass클래스의 print() 메소드
	}
}
