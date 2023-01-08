package creational.builder;

public class VegBurger extends Burger {

    @Override
    public double getPrice() {
        return 750;
    }

    @Override
    public String getName() {
        return "Veg Burger";
    }

}
