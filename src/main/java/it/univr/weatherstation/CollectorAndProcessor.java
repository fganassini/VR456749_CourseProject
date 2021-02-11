package it.univr.weatherstation;

import java.util.ArrayList;
import java.util.List;

public class CollectorAndProcessor {
    private long id;
    private List<WeatherData> weatherData;
    private Config config;

    public CollectorAndProcessor(long id, Config config) {
        this.id = id;
        weatherData = new ArrayList<>();
    }

    public CollectorAndProcessor(long id, ArrayList<WeatherData> weatherData, Config config) {
        this.id = id;
        this.weatherData = weatherData;
        this.config = config;
    }

    public void collectAndProcessingData() {
    }

    public void saveDataOnFile() {

    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public List<WeatherData> getWeatherData() {
        return weatherData;
    }
}
