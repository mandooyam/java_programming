import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;

public class FlowLayoutTest extends Applet {
	public void init(){
		setLayout(new FlowLayout());
		
		for(int i=1;i<10;i++){
			add(new Button("버튼 #"+i));
		}
	}
}
