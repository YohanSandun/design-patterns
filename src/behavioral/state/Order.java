package behavioral.state;

public class Order {

    private State state;
    private boolean paid;

    public ShippedState shippedState;
    public ReadyState readyState;
    public CancelledState cancelledState;

    public Order() {
        shippedState = new ShippedState(this);
        readyState = new ReadyState(this);
        cancelledState = new CancelledState(this);
        state = readyState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public void ship() {
        state.ship();
    }

    public void pay(double amount) {
        state.pay(amount);
    }

    public void cancel() {
        state.cancel();
    }
}
