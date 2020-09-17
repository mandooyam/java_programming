
public class AccessTest {

	public static void main(String[] args) {
		D d = new D();
		E e = new E();
		F f = new F();
		
		d.a = 500;
		// e.b = 500;
		f.c = 500;
		
		System.out.println("a = "+d.a); // a = 500
		// System.out.println("b = "+e.b);
		System.out.println("c = "+f.c); // b = 500
		
		d.method_A();
		// e.method_B();
		f.method_C();
		
		System.out.println("a = "+d.a); // a = 100
		// System.out.println("b = "+e.b);
		System.out.println("c = "+f.c); // b = 300
		
		d.method_D();
		e.method_E();
		f.method_F();
		
		System.out.println("a = "+d.a); // a = 100
		// System.out.println("b = "+e.b);
		System.out.println("c = "+f.c); // b = 300
		
	}

}
