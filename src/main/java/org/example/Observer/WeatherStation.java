package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

class WeatherStation implements Subject {

    public String getWeather() {
        return weather;
    }

    private String weather;

    public WeatherStation() {
        this.observerList = new ArrayList<>();
    }

    private List<Observer> observerList;

    public List<Observer> getObservers() {
        return observerList;
    }

    @Override
    public void notifySubscribers() {
        for (Observer observer : observerList) {
            observer.update(weather);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void setWeather(String weather) {
        this.weather = weather;
        notifySubscribers();
    }
}
