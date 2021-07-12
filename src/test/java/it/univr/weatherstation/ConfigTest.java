package it.univr.weatherstation;

import it.univr.mock.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConfigTest {
    @Test
    public void testConfig() {
        Config c = new Config();
        assertNotNull("New config c should be not null", c);
        assertNotNull("Thermometer1 should be not null", c.getTherm1());
        assertNotNull("Thermometer2 should be not null", c.getTherm2());
        assertNotNull("Barometer should be not null", c.getBarom());
        assertNotNull("Windmeter should be not null", c.getWindm());
        assertNotNull("Rainmeter should be not null", c.getRainm());
        assertNotNull("Sunmeter should be not null", c.getSunm());
    }

    @Test
    public void testChangeConfig1() {
        Config c = new Config();
        c.changeConfig("", "", "", "", "", "");
        assertEquals("Thermometer1_id should be equal to empty string", "", c.getTherm1().getId());
        assertEquals("Thermometer2_id should be equal to empty string", "", c.getTherm2().getId());
        assertEquals("Barometer_id should be equal to empty string", "", c.getBarom().getId());
        assertEquals("Windmeter_id should be equal to empty string", "", c.getWindm().getId());
        assertEquals("Rainmeter_id should be equal to empty string", "", c.getRainm().getId());
        assertEquals("Sunmeter_id should be equal to empty string", "", c.getSunm().getId());
    }

    @Test
    public void testChangeConfig2() {
        Config c = new Config();
        GroundThermometer therm1 = c.getTherm1();
        AirThermometer therm2 = c.getTherm2();
        Barometer barom = c.getBarom();
        WindMeter windm = c.getWindm();
        RainfallMeter rainm = c.getRainm();
        SunshineMeter sunm = c.getSunm();
        c.changeConfig(therm1.getId(), therm2.getId(), barom.getId(), windm.getId(), rainm.getId(), sunm.getId());

        assertEquals("Thermometer1 should be the previous object", therm1, c.getTherm1());
        assertEquals("Thermometer2 should be the previous object", therm2, c.getTherm2());
        assertEquals("Barometer should be the previous object", barom, c.getBarom());
        assertEquals("Windmeter should be the previous object", windm, c.getWindm());
        assertEquals("Rainfallmeter should be the previous object", rainm, c.getRainm());
        assertEquals("Sunshinemeter should be the previous object", sunm, c.getSunm());
    }
}
