package it.univr.weatherstation;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimulatorTest {
    private Simulator s = new Simulator();

    @Test
    public void testIndex() {
        try {
            s.index();
            assertTrue(true);
        }
        catch (Exception e) {
            fail();
        }
    }

    @Test
    public void testCollector() {
        try {
            s.collector();
            assertTrue(true);
        }
        catch (Exception e) {
            fail();
        }
    }

    @Test
    public void testCollectData() {
        try {
            s.collectData();
            assertTrue(true);
        }
        catch (Exception e) {
            fail();
        }
    }

    @Test
    public void testReadData() {
        try {
            s.readData();
            assertTrue(true);
        }
        catch (Exception e) {
            fail();
        }
    }

    @Test
    public void testReconfigure() {
        try {
            s.reconfigure();
            assertTrue(true);
        }
        catch (Exception e) {
            fail();
        }
    }
}
