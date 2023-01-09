package behavioral.state;

public class ReadyState extends State {

    public ReadyState(Order order) {
        super(order);
    }

    @Override
    public void ship() {
        order.setState(order.shippedState);
        System.out.println("Order shipped!");
    }

    @Override
    public void pay(double amount) {
        if (!order.isPaid()) {
            order.setPaid(true);
            System.out.println("Amount paid : " + amount);
        } else
            System.out.println("Already paid!");
    }

    @Override
    public void cancel() {
        order.setState(order.cancelledState);
        System.out.println("Order cancelled!");
    }
}
