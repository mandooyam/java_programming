import java.applet.Applet;
import java.awt.Color;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

// List
public class ListTest extends Applet implements ActionListener, ItemListener{

	Label myLabel;
	List myList;
	
	public void init(){
		myList = new List(3, false);
		myList.add("C언어");
		myList.add("C++언어");
		myList.add("자바");
		myList.add("파스칼");
		myList.addActionListener(this);
		myList.addItemListener(this);
		add(myList);
		
		myLabel = new Label();
		myLabel.setText("리스트 항목을 선택해주세요!");
		myLabel.setAlignment(Label.CENTER);
		myLabel.setBackground(Color.yellow);
		add(myLabel);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==myList){
			myLabel.setText("클릭: "+myList.getSelectedItem());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==myList){
			myLabel.setText("더블클릭: "+myList.getSelectedItem());
		}
	}

}
