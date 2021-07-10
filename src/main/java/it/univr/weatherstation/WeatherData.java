package it.univr.weatherstation;

public class WeatherData {
    private double groundTemperature;
    private double airTemperature;
    private double pressure;
    private String windDirection;
    private double windSpeed;
    private double sunshine;


    public WeatherData(double groundTemperature, double airTemperature, double pressure, String windDirection, double windSpeed, double sunshine) {
        this.groundTemperature = groundTemperature;
        this.airTemperature = airTemperature;
        this.pressure = pressure;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
        this.sunshine = sunshine;
    }

    public double getGroundTemperature() {
        return groundTemperature;
    }

    public double getAirTemperature() {
        return airTemperature;
    }

    public double getPressure() {
        return pressure;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getSunshine() {
        return sunshine;
    }
}
