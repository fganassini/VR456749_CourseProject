package it.univr.weatherstation;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WeatherDataRepository extends CrudRepository<WeatherData, Long> {
    List<WeatherData> findAll();
}
