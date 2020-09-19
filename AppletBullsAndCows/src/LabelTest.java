import java.applet.Applet;
import java.awt.Color;
import java.awt.Label;

// AWT 컴포넌트
// Label
public class LabelTest extends Applet{
	Label myLabel1, myLabel2, myLabel3;
	
	public void init(){
		myLabel1 = new Label();
		myLabel1.setText("C언어");
		myLabel1.setAlignment(Label.LEFT);
		myLabel1.setBackground(Color.cyan);
		add(myLabel1);

		myLabel2 = new Label();
		myLabel2.setText("C++언어");
		myLabel2.setAlignment(Label.CENTER);
		myLabel2.setBackground(Color.green);
		add(myLabel2);

		myLabel3 = new Label();
		myLabel3.setText("자바");
		myLabel3.setAlignment(Label.RIGHT);
		myLabel3.setBackground(Color.yellow);
		add(myLabel3);
	}
}
