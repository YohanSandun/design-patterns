package behavioral.state;

public abstract class State {

    protected Order order;

    public State(Order order) {
        this.order = order;
    }

    public abstract void ship();

    public abstract void pay(double amount);

    public abstract void cancel();

}
