package behavioral.observer;

public class FirstObserver implements IObserver {

    @Override
    public void update(Subject subject) {
        System.out.println("First observer update...");
    }
}
