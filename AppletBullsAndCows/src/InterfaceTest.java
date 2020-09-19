// 인터페이스를 상속받은 클래스는 부모 인터페이스에서 정의된 모든 메소드를 가지고 있어야만 한다.
// 인터페이스는 메소드 헤더만 서언하기 때문에 자식 클래스에서 같은 메소드 헤더를 갖는 메소드를 정의하지 않으면 에러가 발생한다.
public class InterfaceTest implements Height{
	private double cm = 0;
	
	public InterfaceTest(double cm) {
		this.cm = cm;
	}
	
	@Override
	public double getInch() {
		return cm/INCH;
	}

	@Override
	public double getCM() {
		return cm;
	}

	@Override
	public double getMeter() {
		return cm/100;
	}
	
	public static void main(String[] args) {
		InterfaceTest myHeight = new InterfaceTest(183);
		
		System.out.println(myHeight.getCM()+" cm");
		System.out.println(myHeight.getInch()+" inch");
		System.out.println(myHeight.getMeter()+" meter");
	}

}
