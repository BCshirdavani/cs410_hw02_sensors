package sensor;

public class TempSensorAdapter implements Sensor {
	private TemperatureSensor adaptee;

	public TempSensorAdapter(TemperatureSensor tSensor){
		this.adaptee = tSensor;
	}

	@Override
	public String getStatus() {
		return adaptee.getTempReport();
	}
}
