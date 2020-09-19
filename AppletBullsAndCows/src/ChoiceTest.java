// choice
import java.applet.Applet;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceTest extends Applet implements ItemListener {

	Label myLabel;
	Choice myChoice;
	
	public void init(){
		myChoice = new Choice();
		myChoice.addItem("C언어");
		myChoice.addItem("C++언어");
		myChoice.addItem("자바");
		myChoice.addItemListener(this);
		add(myChoice);
		
		myLabel = new Label();
		myLabel.setText("초이스 항목을 선택해주세요!");
		myLabel.setAlignment(Label.CENTER);
		myLabel.setBackground(Color.YELLOW);
		add(myLabel);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==myChoice){
			myLabel.setText("선택: "+myChoice.getSelectedItem());
		}
	}

}
