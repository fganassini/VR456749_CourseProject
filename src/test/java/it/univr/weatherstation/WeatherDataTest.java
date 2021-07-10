package it.univr.weatherstation;

import org.junit.Test;
import static org.junit.Assert.*;

public class WeatherDataTest {

    @Test
    public void testWeatherData() {
        double groundTemperature = 30.5;
        double airTemperature = 27.3;
        double pressure = 20.654;
        String windDirection = "NORD";
        double windSpeed = 10;
        double sunshine = 64;
        WeatherData wd = new WeatherData(groundTemperature, airTemperature, pressure, windDirection, windSpeed, sunshine);
        assertNotNull("WeatherData should be not null", wd);
        assertEquals("GroundTemperature should be equal to " + groundTemperature, groundTemperature, wd.getGroundTemperature(), 0.0001);
        assertEquals("AirTemperature should be equal to " + airTemperature, airTemperature, wd.getAirTemperature(), 0.0001);
        assertEquals("Pressure should be equal to " + pressure, pressure, wd.getPressure(), 0.0001);
        assertEquals("WindDirection should be equal to " + windDirection, windDirection, wd.getWindDirection());
        assertEquals("WindSpeed should be equal to " + windSpeed, windSpeed, wd.getWindSpeed(), 0.0001);
        assertEquals("Sunshine should be equal to " + sunshine, sunshine, wd.getSunshine(), 0.0001);
    }
}
