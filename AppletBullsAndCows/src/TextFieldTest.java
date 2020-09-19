import java.applet.Applet;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

// TextField
public class TextFieldTest extends Applet implements ActionListener, TextListener{

	Label myLabel;
	TextField myTextField;
	
	public void init(){
		myTextField = new TextField(20);
		myTextField.addActionListener(this);
		myTextField.addTextListener(this);
		add(myTextField);
		
		myLabel = new Label();
		myLabel.setText("글을 입력해주세요!");
		myLabel.setAlignment(Label.CENTER);
		myLabel.setBackground(Color.YELLOW);
		add(myLabel);
	}
	
	@Override
	public void textValueChanged(TextEvent e) {
		if(e.getSource()==myTextField){
			myLabel.setText("입력: "+myTextField.getText());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==myTextField){
			myLabel.setText("입력 완료!");
		}
	}

}
