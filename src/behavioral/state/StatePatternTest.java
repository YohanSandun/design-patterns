package behavioral.state;

public class StatePatternTest {

    public static void main(String[] args) {

        Order order = new Order();
        order.pay(1350);
        order.ship();

        System.out.println("---------");
        
        Order anotherOrder = new Order();
        anotherOrder.pay(1500);
        anotherOrder.cancel();
    }

}
