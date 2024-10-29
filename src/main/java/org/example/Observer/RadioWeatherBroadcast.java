package org.example.Observer;

class RadioWeatherBroadcast implements Observer {

    private String weather;

    public String getWeather() {
        return weather;
    }
    @Override
    public void update(String weather) {
        this.weather = weather;
        System.out.println("Radio broadcast: '" + weather + "'");
    }
}
