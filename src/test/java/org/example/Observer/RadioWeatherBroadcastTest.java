package org.example.Observer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioWeatherBroadcastTest {

    @Test
    void update() {

        String weather = "sunny";

        RadioWeatherBroadcast radioWeatherBroadcast = new RadioWeatherBroadcast();

        radioWeatherBroadcast.update(weather);

        Assertions.assertEquals(weather, radioWeatherBroadcast.getWeather());
    }
}