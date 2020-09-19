import java.applet.Applet;
import java.awt.Graphics;

// html파일이 주는 인수를 애플릿에서 사용
public class ParameterTest extends Applet{
	String args;
	
	public void init(){
		args = getParameter("APPLET_PARAMETER");
		System.out.println(args);
		if(args==null){
			args="NO APPLET_PARAMETER";
		}
	}
	
	public void paint(Graphics g){
		g.drawString(args, 50, 100);
	}
}
