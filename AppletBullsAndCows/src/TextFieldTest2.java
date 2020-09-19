import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// TextField, Button
public class TextFieldTest2 extends Applet implements ActionListener {

	Button button;
	TextField textField;
	
	public void init(){
		textField = new TextField(20);
		button = new Button("←");
		
		add(textField);
		add(button);
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button){
			String name=textField.getText();
			int len=name.length();
			textField.setText("");
			if(len>0){
				for(int i=0;i<len-1;i++){
					textField.setText(textField.getText()+name.charAt(i));
				}
			}
		}
	}

}
