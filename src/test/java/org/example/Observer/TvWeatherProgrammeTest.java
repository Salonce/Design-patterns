package org.example.Observer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvWeatherProgrammeTest {

    @Test
    void update() {

        TvWeatherProgramme tvWeatherProgramme = new TvWeatherProgramme();

        String weather = "cloudy";

        tvWeatherProgramme.update(weather);

        Assertions.assertEquals(weather, tvWeatherProgramme.getWeather());

    }

}