package org.example.Observer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherStationTest {

    private WeatherStation weatherStation;
    private Observer observer1;
    private Observer observer2;
    private String weather;

    @BeforeEach
    void beforeEach(){
        weather = "rainy";
        this.weatherStation = Mockito.spy(new WeatherStation());
        this.observer1 = Mockito.mock(Observer.class);
        this.observer2 = Mockito.mock(Observer.class);
    }

    @Test
    void notifySubscribers() {
        weatherStation.addObserver(observer1);
        weatherStation.addObserver(observer2);
        weatherStation.notifySubscribers();

        Mockito.verify(observer1, Mockito.times(1)).update(null);
        Mockito.verify(observer2, Mockito.times(1)).update(null);
    }

    @Test
    void addObserver() {

        weatherStation.addObserver(observer1);
        Assertions.assertEquals(1, weatherStation.getObservers().size());

        weatherStation.addObserver(observer2);
        Assertions.assertEquals(2, weatherStation.getObservers().size());

    }

    @Test
    void removeObserver() {

        weatherStation.addObserver(observer1);
        weatherStation.addObserver(observer2);

        Assertions.assertEquals(2, weatherStation.getObservers().size());

        weatherStation.removeObserver(observer1);
        weatherStation.removeObserver(observer2);

        Assertions.assertFalse(weatherStation.getObservers().contains(observer1));
        Assertions.assertFalse(weatherStation.getObservers().contains(observer2));

    }

    @Test
    void setWeather() {
        weatherStation.setWeather(weather);

        Mockito.verify(weatherStation, Mockito.times(1)).notifySubscribers();
        Assertions.assertEquals(weather, weatherStation.getWeather());
    }
}