package org.example.Observer;

class TvWeatherProgramme implements Observer {
    private String weather;

    public String getWeather() {
        return weather;
    }
    @Override
    public void update(String weather) {
        this.weather = weather;
        System.out.println("TV broadcast: '" + weather + "'");
    }
}
