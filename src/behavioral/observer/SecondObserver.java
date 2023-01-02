package behavioral.observer;

public class SecondObserver implements IObserver {

    @Override
    public void update(Subject subject) {
        System.out.println("Second observer update...");
    }
}
