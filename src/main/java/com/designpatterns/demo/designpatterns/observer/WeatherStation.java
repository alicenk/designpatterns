package com.designpatterns.demo.designpatterns.observer;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@NoArgsConstructor
public class WeatherStation implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        log.info("{} cihazı eklendi", o.getDeviceName());
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        log.info("{} cihazı silindi", o.getDeviceName());
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
