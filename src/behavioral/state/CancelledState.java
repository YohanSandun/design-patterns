package behavioral.state;

public class CancelledState extends State {

    public CancelledState(Order order) {
        super(order);
    }

    @Override
    public void ship() {
        System.out.println("Error: Order is cancelled!");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Error: Order is cancelled!");
    }

    @Override
    public void cancel() {
        System.out.println("Order is already cancelled!");
    }

}
