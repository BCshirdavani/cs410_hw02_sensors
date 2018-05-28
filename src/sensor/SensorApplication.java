package sensor;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class SensorApplication extends JFrame {
	public Sensor[] sensors = {new TempSensorAdapter(new TemperatureSensor()),
			new PressSensorAdapter(new PressureSensor()),
			new RadSensorAdapter(new RadiationSensor())};
	
	public SensorApplication() {
		setTitle("Sensor Tracker");
		setLayout(new GridLayout(3,2));

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
		double presVal = sensors[1].getValue();
		String presStatus = sensors[1].getStatus();
		JLabel presText = new JLabel("Pressure Sensor (" + presStatus + ") --> " + presVal);
		pressurePnl.add(presText);
		add(pressurePnl);

		if(presStatus.equals("OK")){
			GreenShape presShape = new GreenShape();
			add(presShape);
		}
		else{
			RedShape presShape = new RedShape();
			add(presShape);
		}

		//================================================================== Ratiation
		JPanel  radiationPnl = new JPanel();
		double radVal = sensors[2].getValue();
		String radStatus = sensors[2].getStatus();
		JLabel radText = new JLabel("Radiation Sensor (" + radStatus + ") --> " + radVal);
		radiationPnl.add(radText);
		add(radiationPnl);
		if(radStatus.equals("OK")){
			GreenShape radShape = new GreenShape();
			add(radShape);
		}
		else{
			RedShape radShape = new RedShape();
			add(radShape);
		}



		setPreferredSize(new Dimension(600,600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}

	public static void main(String[] args) {
		SensorApplication app = new SensorApplication();
	}

}
