package behavioral.observer;

public class ObserverPatternTest {

    public static void main(String[] args) {

        Subject subject = new Subject();

        FirstObserver firstObserver = new FirstObserver();
        SecondObserver secondObserver = new SecondObserver();

        subject.subscribe(firstObserver);
        subject.subscribe(secondObserver);
        subject.doSomething();
    }

}
