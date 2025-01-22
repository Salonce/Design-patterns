package org.example.State;

public class GreenTrafficLight implements TrafficLightState{
    @Override
    public void changeState(TrafficLightContext trafficLightContext) {
        trafficLightContext.setTrafficLightState(new RedTrafficLight());
    }
}
