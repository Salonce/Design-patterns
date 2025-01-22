package org.example.State;

public class YellowTrafficLight implements TrafficLightState {
    @Override
    public void changeState(TrafficLightContext trafficLightContext) {
        trafficLightContext.setTrafficLightState(new GreenTrafficLight());
    }
}
