package it.univr.weatherstation;

import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

public class CollectorAndProcessor {
    private Config config;
    private boolean status;
    private List<WeatherData> list = new ArrayList<>();

    public CollectorAndProcessor() {
        this.config = new Config();
        this.status = false;
    }

    public void collectAndProcessingData() {
        float groundTemperature = config.getTherm1().measureGroundTemperature();
        float airTemperature = config.getTherm2().measureAirTemperature();
        float pressure = config.getBarom().measurePressure();
        String windDirection = config.getWindm().measureWindDirection();
        float windSpeed = config.getWindm().measureWindSpeed();
        float rain = config.getRainm().measureRainfall();
        float sunshine = config.getSunm().measureSunshine();
        list.add(new WeatherData(groundTemperature, airTemperature, pressure, windDirection, windSpeed, rain, sunshine));
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public Config getConfig() {
        return config;
    }

    public List<WeatherData> getWeatherData() {
        return list;
    }

    public void clearList() { list.clear(); }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() { return status; }
}
