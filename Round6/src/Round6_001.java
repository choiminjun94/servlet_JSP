import java.awt.*;
import java.applet.*;

public class Round6_001 extends Applet{
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", new Label("sample"));
		Label lb = new Label("Hello Applet!", Label.CENTER);
		lb.setFont(new Font("Sans-Serif", Font.BOLD, 20));
		lb.setBackground(Color.BLACK);
		lb.setForeground(Color.WHITE);
		this.add("Center", lb);
		this.add("South", new Button("확인"));
	}
	
}
