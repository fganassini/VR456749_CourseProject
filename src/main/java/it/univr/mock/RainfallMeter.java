package it.univr.mock;

public class RainfallMeter {
    private final String id;
    private float rainfall = 159;

    public RainfallMeter(String id) {
        this. id = id;
    }

    public float measureRainfall() {
        return rainfall;
    }

    public String getId() { return  id; }
}
