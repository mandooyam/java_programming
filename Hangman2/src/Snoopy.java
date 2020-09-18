// 자식클래스 (메소드 오버라이딩 연습)
public class Snoopy extends Dog{
	public Snoopy(){
		super("스누피", 3);
	}
	
	public void bite(String name, int age){
		System.out.println(dog_name+"가 문 "+name+"는 "+age+"살입니다. (메소드 오버로딩)");
		/*메소드 오버로딩이란, 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메소드가 있더라도
		 * 매개 변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메소드를 정의할 수 있는 것.
		 * 메소드 오버로딩이 필요한 이유는 매개 값을 다양하게 받아 처리할 수 있도록 하기 위해서이다.
		 * */
	}
	
	public void bark(){
		System.out.println("안녕하세요, "+dog_name+"입니다. (메소드 오버라이딩)");
		/*상속 관계에 있는 클래스 간에 같은 이름의 메소드를 정의하는 기술을 오버라이딩이라고 한다.*/
	}
}
