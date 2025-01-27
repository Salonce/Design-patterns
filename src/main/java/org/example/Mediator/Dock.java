package org.example.Mediator;

public interface Dock {
    void requestDocking(Ship ship);
    void requestLeaving(Ship ship);
}
