package sensor;

public class PressSensorAdapter implements Sensor {
	private PressureSensor adaptee;

	public PressSensorAdapter(PressureSensor pSensor){
		this.adaptee = pSensor;
	}

	@Override
	public String getStatus() {
		return adaptee.getReport();
	}

	@Override
	public double getValue() {
		return adaptee.readValue();
	}
}
