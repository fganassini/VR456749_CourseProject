package it.univr.weatherstation;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class WeatherDataTest {

    @Test
    public void weatherDataTest() {
        WeatherData wd = new WeatherData(0, 0, 0, "", 0, 0, 0);
        Assert.assertNotNull("Weather data wd should not be null", wd);
    }

    @Test
    public void getGroundTemperatureTest() {
        WeatherData wd = new WeatherData(0, 0, 0, "", 0, 0, 0);
        Assert.assertEquals("Ground temperature should be equal to " + 0, 0, wd.getGroundTemperature(), 0.0001);

    }

    @Test
    public void getAirTemperatureTest() {
        WeatherData wd = new WeatherData(0, 0, 0, "", 0, 0, 0);
        Assert.assertEquals("Air temperature should be equal to " + 0, 0, wd.getAirTemperature(), 0.0001);
    }

    @Test
    public void getPressureTest() {
        WeatherData wd = new WeatherData(0, 0, 0, "", 0, 0, 0);
        Assert.assertEquals("Pressure should be equal to " + 0, 0, wd.getPressure(), 0.0001);
    }

    @Test
    public void getWindDirectionTest() {
        WeatherData wd = new WeatherData(0, 0, 0, "", 0, 0, 0);
        Assert.assertEquals("Wind direction should be empty string", "", wd.getWindDirection());
    }

    @Test
    public void getWindSpeedTest() {
        WeatherData wd = new WeatherData(0, 0, 0, "", 0, 0, 0);
        Assert.assertEquals("Wind speed should be equal to " + 0, 0, wd.getWindSpeed(), 0.0001);
    }

    @Test
    public void getRainTest() {
        WeatherData wd = new WeatherData(0, 0, 0, "", 0, 0, 0);
        Assert.assertEquals("Rain should be equal to " + 0, 0, wd.getRain(), 0.0001);
    }

    @Test
    public void getSunshineTest() {
        WeatherData wd = new WeatherData(0, 0, 0, "", 0, 0, 0);
        Assert.assertEquals("Sunshine should be equal to " + 0, 0, wd.getSunshine(), 0.0001);
    }

    @Test
    public void getDateTimeTest() {
        WeatherData wd = new WeatherData(0, 0, 0, "", 0, 0, 0);
        Assert.assertNotNull("Data and time should be not null", wd.getDateTime());
    }
}
