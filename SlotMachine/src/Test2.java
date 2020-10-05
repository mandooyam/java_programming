import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test2 extends JFrame implements ActionListener {

	JButton b1, b2;
	ImageIcon icon, icon2;
	Image im, im2, temp;
	JLabel img;
	
	public static void main(String[] args) {
		Test2 test = new Test2();
	}
	
	public Test2() {
		this.setTitle("Swing GUI");
		this.setVisible(true);
		this.setBounds(100, 100, 500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1 = new JButton("원본");
		b2 = new JButton("변환");
		
		this.setLayout(new FlowLayout());
		this.add(b1); //컨테이너에 컴포넌트 추가
		this.add(b2);
		
		JLabel label = new JLabel("This is Label");
		this.add(label);
		JTextField tf = new JTextField(20);
		this.add(tf);
		
		icon = new ImageIcon("images/iu.jpg"); //이미지아이콘
		
		im = icon.getImage(); //객체 사이즈를 새롭게 만들기!
		im2 = im.getScaledInstance(250, 250, Image.SCALE_DEFAULT);
		icon2 = new ImageIcon(im2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			img = new JLabel(icon);
			this.add(img);
			this.setVisible(true); //화면에 보이기
		}
		else if(e.getSource()==b2) {
			img = new JLabel(icon2);
			this.add(img);
			this.setVisible(true); //화면에 보이기
		}
	}
	
}
