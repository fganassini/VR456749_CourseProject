package it.univr.mock;

public class Barometer {
    private final String id;
    private float pressure = (float) 10000.8;

    public Barometer(String id) {
        this.id = id;
    }

    public float measurePressure() {
        return pressure;
    }

    public String getId() { return  id; }
}
