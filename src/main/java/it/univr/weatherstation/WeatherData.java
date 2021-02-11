package it.univr.weatherstation;

public class WeatherData {
    private float groundTemperature;
    private float airTemperature;
    private float pressure;
    private String windDirection;
    private float windSpeed;
    private float sunshine;


    public WeatherData(float groundTemperature, float airTemperature, float pressure, String windDirection, float windSpeed, float sunshine) {
        this.groundTemperature = groundTemperature;
        this.airTemperature = airTemperature;
        this.pressure = pressure;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
        this.sunshine = sunshine;
    }

    public float getGroundTemperature() {
        return groundTemperature;
    }

    public float getAirTemperature() {
        return airTemperature;
    }

    public float getPressure() {
        return pressure;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public float getSunshine() {
        return sunshine;
    }
}
