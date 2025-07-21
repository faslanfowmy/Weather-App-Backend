package com.faslanfowmy.weather_app_fidenz.controller;

import com.faslanfowmy.weather_app_fidenz.model.City;
import com.faslanfowmy.weather_app_fidenz.model.WeatherData;
import com.faslanfowmy.weather_app_fidenz.model.WeatherResponse;
import com.faslanfowmy.weather_app_fidenz.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/cities")
    public List<City> getCities() throws IOException {
        return weatherService.readCityCodes();
    }

    @GetMapping("/get")
    public void get() throws IOException {
        weatherService.getWeatherDeatils();
    }

    @GetMapping("/weather")
    public List<WeatherData> getWeatherDetails() throws IOException{
        return weatherService.getAllWeatherDetails();
    }
}
