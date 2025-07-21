package com.faslanfowmy.weather_app_fidenz.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

    private Coord coord;
    private List<Weather> weather;
    private Main main;
    private Wind wind;
    private Clouds clouds;
    private Sys sys;

    private String base;
    private int visibility;
    private long dt;
    private long timezone;
    private long id;
    private String name;
    private int cod;

    @Getter
    @Setter
    public static class Coord{
        @JsonProperty("lon")
        private double longitude;
        @JsonProperty("lat")
        private double latitude;
    }

    @Getter
    @Setter
    public static class Weather{
        private int id;
        private String main;
        private String description;
        private String icon;

    }

    @Getter
    @Setter
    public static class Main{
        private double temp;
        @JsonProperty("feels_like")
        private double feelsLike;
        @JsonProperty("temp_min")
        private double tempMin;
        @JsonProperty("temp_max")
        private double tempMax;
        private double pressure;
        private double humidity;
        @JsonProperty("sea_level")
        private double seaLevel;
        @JsonProperty("grnd_level")
        private double groundLevel;

    }

    @Getter
    @Setter
    public static class Wind{
        private double speed;
        private int deg;
        private double gust;
    }

    @Getter
    @Setter
    public static class Clouds{
        private int all;
    }

    @Getter
    @Setter
    public static class Sys{
        private String country;
        private long sunrise;
        private long sunset;
    }


}
