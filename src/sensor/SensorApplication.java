package sensor;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class SensorApplication extends JFrame {
	public Sensor[] sensors = {new TempSensorAdapter(new TemperatureSensor())};
	
	public SensorApplication() {
		setTitle("Sensor Tracker");
		setLayout(new GridLayout(3,1));
	
		JPanel  temperaturePnl = new JPanel();
		temperaturePnl.setBorder(new TitledBorder("Temperature"));
//		temperaturePnl.setToolTipText(sensors[0].getStatus());
		System.out.println("Tempurature status: " + sensors[0].getStatus());
		add(temperaturePnl);
		
		setPreferredSize(new Dimension(600,600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}

	public static void main(String[] args) {
		SensorApplication app = new SensorApplication();
	}

}
