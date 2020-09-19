// 메인
public class ConstructorTest {

	public static void main(String[] args) {
		Animal aAnimal = new Animal();
		aAnimal.print(); // 이름: 동물 나이: 0세
		
		Human aHuman = new Human();
		aHuman.print(); // 이름: 인간 나이: 0세
		
		Boy aBoy = new Boy();
		aBoy.print(); // 이름: 소년 나이: 0세
		
		System.out.println();
		
		Animal tiger = new Animal("거북이", 8);
		tiger.print(); // 이름: 거북이 나이: 8세
		
		Human mary = new Human("김정아", 20);
		mary.print(); // 이름: 김정아 나이: 20세
		
		Boy smin = new Boy("백승민", 14);
		smin.print(); // 이름: 백승민 나이: 14세
	}

}
