package org.example.State;

public class RedTrafficLight implements TrafficLightState {
    @Override
    public void changeState(TrafficLightContext trafficLightContext) {
        trafficLightContext.setTrafficLightState(new YellowTrafficLight());
    }
}
