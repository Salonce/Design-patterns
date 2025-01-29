package org.example.State;

public class TrafficLightContext {

    private TrafficLightState trafficLightState;

    public TrafficLightContext(TrafficLightState trafficLightState){
        this.trafficLightState = trafficLightState;
    }

    public TrafficLightState getTrafficLightState() {
        return this.trafficLightState;
    }

    public void setTrafficLightState(TrafficLightState trafficLightState) {
        this.trafficLightState = trafficLightState;
    }

    public void changeTrafficLight(){
        trafficLightState = trafficLightState.nextState();
    }

    public LightColor getLightColor(){
        return trafficLightState.getColor();
    }

}
