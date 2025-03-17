package org.example.Observer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InternetWeatherWebsiteTest {

    @Test
    void update() {

        String weather = "rainy";

        InternetWeatherWebsite internetWeatherWebsite = new InternetWeatherWebsite();

        internetWeatherWebsite.update(weather);

        Assertions.assertEquals(internetWeatherWebsite.getWeather(), weather);
    }
}