// 메인
public class OverridingTest {

	public static void main(String[] args) {
		Dog yourDog = new Dog("벤지", 4);
		
		yourDog.bark(); // 멍멍
		yourDog.bite("우체부"); // 벤지가 우체부을 물었습니다.
		
		Snoopy myDog = new Snoopy();
		
		myDog.bark(); // 메소드 오버라이딩, 안녕하세요, 스누피입니다. (메소드 오버라이딩)
		myDog.bite("낸시", 9); // 메소드 오버로딩, 스누피가 문 낸시는 9살입니다. (메소드 오버로딩)
	}

}
