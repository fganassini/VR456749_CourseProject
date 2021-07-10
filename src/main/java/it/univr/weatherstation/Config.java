package it.univr.weatherstation;

public class Config {
    private String therm1Id;
    private String therm2Id;
    private String baromId;
    private String windmId;
    private String rainmId;
    private String sunmId;

    public Config() {
        therm1Id = "th1_1";
        therm2Id = "th2_2";
        baromId = "b_1";
        windmId = "w_1";
        rainmId = "r_1";
        sunmId = "s_1";
    }

    public void setTherm1Id(String therm1Id) {
        this.therm1Id = therm1Id;
    }

    public void setTherm2Id(String therm2Id) {
        this.therm2Id = therm2Id;
    }

    public void setBaromId(String baromId) {
        this.baromId = baromId;
    }

    public void setWindmId(String windmId) {
        this.windmId = windmId;
    }

    public void setRainmId(String rainmId) {
        this.rainmId = rainmId;
    }

    public void setSunmId(String sunmId) {
        this.sunmId = sunmId;
    }

    public String getTherm1Id() {
        return therm1Id;
    }

    public String getTherm2Id() {
        return therm2Id;
    }

    public String getBaromId() {
        return baromId;
    }

    public String getWindmId() {
        return windmId;
    }

    public String getRainmId() {
        return rainmId;
    }

    public String getSunmId() {
        return sunmId;
    }
}
