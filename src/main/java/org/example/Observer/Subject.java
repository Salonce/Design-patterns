package org.example.Observer;

public interface Subject{
    public void notifySubscribers();
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
}

