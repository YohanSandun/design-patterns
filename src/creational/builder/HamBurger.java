package creational.builder;

public class HamBurger extends Burger {

    @Override
    public double getPrice() {
        return 950;
    }

    @Override
    public String getName() {
        return "Ham Burger";
    }
}
