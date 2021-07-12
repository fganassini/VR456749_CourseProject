package it.univr.mock;

public class WindMeter {
    private final String id;
    private String direction = "NORD-EST";
    private float speed = 30;

    public WindMeter(String id) {
        this.id = id;
    }

    public String measureWindDirection() {
        return direction;
    }

    public float measureWindSpeed() {
        return speed;
    }

    public String getId() { return  id; }
}
