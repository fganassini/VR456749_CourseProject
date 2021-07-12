package it.univr.mock;

public class GroundThermometer {
    private final String id;
    private float temperature = (float) 20.5;

    public GroundThermometer(String id) {
        this. id = id;
    }

    public float measureGroundTemperature() {
        return temperature;
    }

    public String getId() { return  id; }
}
