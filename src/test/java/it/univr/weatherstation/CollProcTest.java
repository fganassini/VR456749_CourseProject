package it.univr.weatherstation;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CollProcTest {

    @Test
    public void testCollectorAndProcessor() {
        CollectorAndProcessor cp = new CollectorAndProcessor();
        assertNotNull("CollectorAndProcessor cp should be not null", cp);
    }

    @Test
    public void TestCollectAndProcessData() {
        CollectorAndProcessor cp = new CollectorAndProcessor();
        assertTrue(cp.CollectAndProcessingData());
    }

    @Test
    public void setConfig() {
        CollectorAndProcessor cp = new CollectorAndProcessor();
        Config conf = new Config();
        cp.setConfig(conf);
        assertEquals("Configuration should be equal", conf, cp.getConfig());
    }

    @Test
    public void TestGetWeatherDataEmpty() {
        CollectorAndProcessor cp = new CollectorAndProcessor();
        try {
            List<WeatherData> list = cp.getWeatherData();
            fail();
        }
        catch (Exception e) {
            assertTrue(true);
        }
    }

}
