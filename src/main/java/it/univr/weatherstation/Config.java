package it.univr.weatherstation;

import it.univr.mock.*;

public class Config {
    private GroundThermometer therm1;
    private AirThermometer therm2;
    private Barometer barom;
    private WindMeter windm;
    private RainfallMeter rainm;
    private SunshineMeter sunm;

    public Config() {
        therm1 = new GroundThermometer("th1_1");
        therm2 = new AirThermometer("th2_2");
        barom =  new Barometer("b_1");
        windm = new WindMeter("w_1");
        rainm = new RainfallMeter("r_1");
        sunm = new SunshineMeter("s_1");
    }

    public void changeConfig(String therm1Id, String therm2Id, String baromId, String windmId, String rainmId, String sunmId) {
        if(!therm1Id.equals(therm1.getId()))
            therm1 = new GroundThermometer(therm1Id);

        if(!therm2Id.equals(therm2.getId()))
            therm2 = new AirThermometer(therm2Id);

        if(!baromId.equals(barom.getId()))
            barom = new Barometer(baromId);

        if(!windmId.equals(windm.getId()))
            windm = new WindMeter(windmId);

        if(!rainmId.equals(rainm.getId()))
            rainm = new RainfallMeter(rainmId);

        if(!sunmId.equals(sunm.getId()))
            sunm = new SunshineMeter(sunmId);
    }


    public GroundThermometer getTherm1() {
        return therm1;
    }

    public AirThermometer getTherm2() {
        return therm2;
    }

    public Barometer getBarom() {
        return barom;
    }

    public WindMeter getWindm() {
        return windm;
    }

    public RainfallMeter getRainm() {
        return rainm;
    }

    public SunshineMeter getSunm() {
        return sunm;
    }
}
