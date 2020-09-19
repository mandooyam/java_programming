import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;

public class GridLayoutTest extends Applet {
	public void init(){
		setLayout(new GridLayout(0, 3));
		
		for(int i=1;i<10;i++){
			add(new Button("버튼 #"+i));
		}
	}
}
