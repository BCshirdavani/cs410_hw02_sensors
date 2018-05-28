package sensor;

public class RadSensorAdapter implements Sensor {
	private RadiationSensor adaptee;

	public RadSensorAdapter(RadiationSensor rSensor){
		this.adaptee = rSensor;
	}

	@Override
	public String getStatus() {
		return adaptee.getStatusInfo();
	}

	@Override
	public double getValue() {
		return adaptee.getRadiationValue();
	}

}
