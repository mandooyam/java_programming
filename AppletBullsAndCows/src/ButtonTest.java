import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Button
public class ButtonTest extends Applet implements ActionListener{
	
	Label myLabel;
	Button myButton1, myButton2, myButton3;
	
	public void init(){
		myButton1 = new Button();
		myButton1.setLabel("C언어");
		myButton1.addActionListener(this);
		add(myButton1);

		myButton2 = new Button("C++언어");
		myButton2.addActionListener(this);
		add(myButton2);

		myButton3 = new Button("자바");
		myButton3.addActionListener(this);
		add(myButton3);
		
		myLabel = new Label();
		myLabel.setText("버튼을 눌러주세요!");
		myLabel.setAlignment(Label.CENTER);
		myLabel.setBackground(Color.YELLOW);
		add(myLabel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==myButton1){
			myLabel.setText("선택: C언어");
		}else if(e.getSource()==myButton2){
			myLabel.setText("선택: C++언어");
		}else if(e.getSource()==myButton3){
			myLabel.setText("선택: 자바");
		}
	}
	
}
