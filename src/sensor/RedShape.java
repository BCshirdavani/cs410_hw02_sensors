package sensor;

import javax.swing.*;
import java.awt.*;

public class RedShape extends JPanel {

	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(1,1,180,20);
	}

}
