import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollbarTest extends Applet implements AdjustmentListener {
	
	Label myLabel;
	Scrollbar myScrollbar;
	
	public void init(){
		setLayout(new BorderLayout());
		
		myScrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 50, 0, 1, 100);
		myScrollbar.addAdjustmentListener(this);
		add("North", myScrollbar);
		
		myLabel = new Label();
		myLabel.setText("스크롤바를 조정하세요!");
		myLabel.setAlignment(Label.CENTER);
		myLabel.setBackground(Color.YELLOW);
		add("Center", myLabel);
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		myLabel.setText("위치: "+myScrollbar.getValue());
	}

}
