import javax.swing.JFrame;

public class Test extends JFrame{
	
	public static void main(String[] args) {
		Test test = new Test();
	}

	public Test() {
		init();
	}
	public void init() {
		this.setVisible(true);
		this.setBounds(100, 100, 500, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
