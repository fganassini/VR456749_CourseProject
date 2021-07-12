package it.univr.mock;

public class AirThermometer {
    private final String id;
    private float temperature = (float) 18.7;

    public AirThermometer(String id) {
        this.id = id;
    }

    public float measureAirTemperature() {
        return temperature;
    }

    public String getId() { return  id; }

}
