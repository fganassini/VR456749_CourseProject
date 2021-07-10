package it.univr.weatherstation;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConfigTest {
    @Test
    public void testConfig() {
        Config c = new Config();
        assertNotNull("New config c should be not null", c);
        assertNotNull("Thermometer1_id should be initialized", c.getTherm1Id());
        assertNotNull("Thermometer2_id should be initialized", c.getTherm2Id());
        assertNotNull("Barometer_id should be initialized", c.getBaromId());
        assertNotNull("Windmeter_id should be initialized", c.getWindmId());
        assertNotNull("Rainmeter_id should be initialized", c.getRainmId());
        assertNotNull("Sunmeter_id should be initialized", c.getSunmId());
    }

    @Test
    public void testSetTherm1Id() {
        Config c = new Config();
        String id = "th1_2";
        c.setTherm1Id(id);
        assertEquals("Therm1_id should be equal to " + id, id, c.getTherm1Id());
    }

    @Test
    public void testSetTherm2Id() {
        Config c = new Config();
        String id = "th2_2";
        c.setTherm2Id(id);
        assertEquals("Therm2_id should be equal to " + id, id, c.getTherm2Id());
    }

    @Test
    public void testSetBaromId() {
        Config c = new Config();
        String id = "b_2";
        c.setBaromId(id);
        assertEquals("Barom_id should be equal to " + id, id, c.getBaromId());
    }

    @Test
    public void testSetWindmId() {
        Config c = new Config();
        String id = "w_2";
        c.setWindmId(id);
        assertEquals("Windm_id should be equal to " + id, id, c.getWindmId());
    }

    @Test
    public void testSetRainmId() {
        Config c = new Config();
        String id = "r_2";
        c.setRainmId(id);
        assertEquals("Rainm1_id should be equal to " + id, id, c.getRainmId());
    }

    @Test
    public void testSetSunmId() {
        Config c = new Config();
        String id = "s_2";
        c.setSunmId(id);
        assertEquals("Sunm_id should be equal to " + id, id, c.getSunmId());
    }
}
