package sensor;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class SensorApplication extends JFrame {
	public Sensor[] sensors = {new TempSensorAdapter(new TemperatureSensor())};
	
	public SensorApplication() {
		setTitle("Sensor Tracker");
		setLayout(new GridLayout(6,1));

		//================================================================== Tempurature
		JPanel  temperaturePnl = new JPanel();
		double tempVal = sensors[0].getValue();
		String tempStatus = sensors[0].getStatus();
		JLabel tempText = new JLabel("Temperature Sensor (" + tempStatus + ") --> " + tempVal);

		temperaturePnl.add(tempText);
		add(temperaturePnl);

		if(tempStatus.equals("OK")){
			GreenShape tempShape = new GreenShape();
			add(tempShape);
		}
		else{
			RedShape tempShape = new RedShape();
			add(tempShape);
		}

		System.out.println("Tempurature status: " + sensors[0].getStatus() + "\t\t From string: "+ tempStatus);
		System.out.println("Tempurature value: " + sensors[0].getValue() + "\t\t From string: "+ tempVal);

		//================================================================== Pressure
		JPanel  pressurePnl = new JPanel();
		pressurePnl.setBorder(new TitledBorder("Pressure"));
		System.out.println("Pressure status: " + sensors[0].getStatus());
		System.out.println("Pressure value: " + sensors[0].getValue());
		add(pressurePnl);


		//================================================================== Ratiation
		JPanel  radiationPnl = new JPanel();
		radiationPnl.setBorder(new TitledBorder("Radiation"));
		System.out.println("Radiation status: " + sensors[0].getStatus());
		System.out.println("Radiation value: " + sensors[0].getValue());
		add(radiationPnl);


		setPreferredSize(new Dimension(600,600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}

	public static void main(String[] args) {
		SensorApplication app = new SensorApplication();
	}

}
