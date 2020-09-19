import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;

public class BorderLayoutTest extends Applet {
	String[] area = {"East", "West", "South", "North", "Center"};
	
	public void init(){
		setLayout(new BorderLayout(0, 3)); // horizontal: 가로, vertical: 세로
		
		for(int i=0;i<5;i++){
			add(area[i], new Button(area[i]));
		}
	}
}
