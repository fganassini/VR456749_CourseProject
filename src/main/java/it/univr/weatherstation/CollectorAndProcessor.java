package it.univr.weatherstation;

import java.util.List;

public class CollectorAndProcessor {
    private Config config;

    public CollectorAndProcessor() {
        this.config = new Config();
    }

    public boolean CollectAndProcessingData() {
        return true;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public Config getConfig() {
        return config;
    }

    public List<WeatherData> getWeatherData() {
        return null;
    }
}
