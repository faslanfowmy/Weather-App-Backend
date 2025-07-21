package com.faslanfowmy.weather_app_fidenz.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CityListWrapper {

    @JsonProperty("List")
    private List<City> List;
}
