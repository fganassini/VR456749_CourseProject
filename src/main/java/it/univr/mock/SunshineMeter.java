package it.univr.mock;

public class SunshineMeter {
    private final String id;
    private float sunshine = (float) 156.8;

    public SunshineMeter(String id) {
        this. id = id;
    }

    public float measureSunshine() {
        return sunshine;
    }

    public String getId() { return  id; }
}
