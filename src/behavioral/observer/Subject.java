package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<IObserver> observers = new ArrayList<>();

    public void subscribe(IObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (IObserver observer: observers) {
            observer.update(this);
        }
    }

    public void doSomething() {
        notifyObservers();
    }

}
