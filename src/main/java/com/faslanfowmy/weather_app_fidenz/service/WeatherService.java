package com.faslanfowmy.weather_app_fidenz.service;

import com.faslanfowmy.weather_app_fidenz.model.City;
import com.faslanfowmy.weather_app_fidenz.model.CityListWrapper;
import com.faslanfowmy.weather_app_fidenz.model.WeatherData;
import com.faslanfowmy.weather_app_fidenz.model.WeatherResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    public List<City> readCityCodes() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        InputStream stream = new ClassPathResource("static/cities.json").getInputStream();

        CityListWrapper wrapper = mapper.readValue(stream, CityListWrapper.class);

        System.out.println(wrapper.getList().getClass().getName());
        return wrapper.getList();
    }

    public void getWeatherDeatils() throws IOException {

       List<City> cities = readCityCodes();
        System.out.println(cities);

    }

    public WeatherResponse fetchWeatherByCityId(long cityId){
        String url = "https://api.openweathermap.org/data/2.5/weather?id=" + cityId + "&appid="+apiKey;
        return restTemplate.getForObject(url, WeatherResponse.class);
    }


    @Cacheable("weather")
    public List<WeatherData> getAllWeatherDetails() throws IOException{
        System.out.println("data from the 1st time");
        List<City> cities = readCityCodes();
        List<WeatherData> weatherData = new ArrayList<>();

        for (City city : cities){
            WeatherResponse weatherResponse = fetchWeatherByCityId(city.getId());

            WeatherData data = new WeatherData();
            data.setCityName(weatherResponse.getName());
            data.setCountry(weatherResponse.getSys().getCountry());
            data.setTemperature(weatherResponse.getMain().getTemp());
            data.setMinTemp(weatherResponse.getMain().getTempMin());
            data.setMaxTemp(weatherResponse.getMain().getTempMax());
            data.setPressure(weatherResponse.getMain().getPressure());
            data.setHumidity(weatherResponse.getMain().getHumidity());
            data.setVisibility(weatherResponse.getVisibility());
            data.setWindSpeed(weatherResponse.getWind().getSpeed());
            data.setWindDeg(weatherResponse.getWind().getDeg());
            data.setSunrise(weatherResponse.getSys().getSunrise());
            data.setSunset(weatherResponse.getSys().getSunset());
            data.setWeatherDescription(weatherResponse.getWeather().getFirst().getDescription());
            data.setLatitude(weatherResponse.getCoord().getLatitude());
            data.setLongitude(weatherResponse.getCoord().getLongitude());
            weatherData.add(data);
        }

        return weatherData;
    }
    




}
