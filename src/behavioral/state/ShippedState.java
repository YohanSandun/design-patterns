package behavioral.state;

public class ShippedState extends State {

    public ShippedState(Order order) {
        super(order);
    }

    @Override
    public void ship() {
        System.out.println("Order already shipped!");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Already paid!");
    }

    @Override
    public void cancel() {
        System.out.println("Can't cancel shipped orders!");
    }

}
