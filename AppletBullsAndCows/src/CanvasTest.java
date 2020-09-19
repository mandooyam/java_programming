import java.applet.Applet;

public class CanvasTest extends Applet {
	MyCanvas myCanvas;
	
	public void init(){
		myCanvas = new MyCanvas();
		add(myCanvas);
	}
}
