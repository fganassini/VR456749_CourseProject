package it.univr.weatherstation;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CollProcTest {

    @Test
    public void CollectorAndProcessorTest() {
        CollectorAndProcessor cp = new CollectorAndProcessor();
        assertNotNull("CollectorAndProcessor cp should be not null", cp);
    }

    @Test
    public void collectAndProcessDataTest() {
        CollectorAndProcessor cp = new CollectorAndProcessor();
        try {
            cp.collectAndProcessingData();
            assertTrue(true);
        }
        catch (Exception e) {
            fail();
        }
    }

    @Test
    public void setConfigTest() {
        CollectorAndProcessor cp = new CollectorAndProcessor();
        Config conf = new Config();
        cp.setConfig(conf);
        assertEquals("Configuration should be equal", conf, cp.getConfig());
    }

    @Test
    public void setStatusTest() {
        CollectorAndProcessor cp = new CollectorAndProcessor();
        boolean status = true;
        cp.setStatus(status);
        assertEquals("Status must be " + status, status, cp.getStatus());
    }

    @Test
    public void clearListTest() {
        CollectorAndProcessor cp = new CollectorAndProcessor();
        for(int i = 0; i < 3; i++)
            cp.collectAndProcessingData();

        Assert.assertTrue(cp.getWeatherData().size() > 0);
        cp.clearList();
        Assert.assertTrue(cp.getWeatherData().size() == 0);
    }
}
