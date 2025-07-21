package com.faslanfowmy.weather_app_fidenz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherData {

    private String cityName;
    private String Country;
    private double temperature;
    private double minTemp;
    private double maxTemp;
    private double pressure;
    private double humidity;
    private double visibility;
    private double windSpeed;
    private double WindDeg;
    private long sunrise;
    private long sunset;
    private String weatherDescription;
    private double latitude;
    private double longitude;
}
