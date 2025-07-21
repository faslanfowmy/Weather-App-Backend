package com.faslanfowmy.weather_app_fidenz.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {

    @JsonProperty("CityCode")
    private long id;
    @JsonProperty("CityName")
    private String city;
    @JsonProperty("Temp")
    private String temperature;
    @JsonProperty("Status")
    private String status;
}
