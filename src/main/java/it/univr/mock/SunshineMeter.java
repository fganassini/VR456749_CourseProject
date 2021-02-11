package it.univr.mock;

public class SunshineMeter {
    private final String id;
    private float sunshine = (float) 156.8;

    public SunshineMeter() {
        this.id = "s_1";
    }

    public SunshineMeter(String id) {
        this. id = id;
    }

    public float measureSunshine() {
        return sunshine;
    }
}
