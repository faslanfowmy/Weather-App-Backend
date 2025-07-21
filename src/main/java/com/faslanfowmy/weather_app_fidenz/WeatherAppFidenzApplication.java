package com.faslanfowmy.weather_app_fidenz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class WeatherAppFidenzApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherAppFidenzApplication.class, args);
	}

}
