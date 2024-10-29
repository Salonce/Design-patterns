package org.example.Observer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class InternetWeatherWebsiteTest {

    @Test
    void update() {

        String weather = "rainy";

        InternetWeatherWebsite internetWeatherWebsite = new InternetWeatherWebsite();

        internetWeatherWebsite.update(weather);

        Assertions.assertEquals(internetWeatherWebsite.getWeather(), weather);
    }
}