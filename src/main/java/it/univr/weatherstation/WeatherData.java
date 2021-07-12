package it.univr.weatherstation;

import jdk.nashorn.internal.objects.annotations.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

@Entity
public class WeatherData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private float groundTemperature;
    private float airTemperature;
    private float pressure;
    private String windDirection;
    private float windSpeed;
    private float rain;
    private float sunshine;
    private Date dateTime;

    protected WeatherData() {}

    public WeatherData(float groundTemperature, float airTemperature, float pressure, String windDirection, float windSpeed, float rain, float sunshine) {
        this.groundTemperature = groundTemperature;
        this.airTemperature = airTemperature;
        this.pressure = pressure;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
        this.rain = rain;
        this.sunshine = sunshine;
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
        this.dateTime = calendar.getTime();
    }

    public Long getId() {
        return id;
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

    public float getRain() {
        return rain;
    }

    public float getSunshine() {
        return sunshine;
    }

    public String getDateTime() {
        return dateTime.toString();
    }
}
