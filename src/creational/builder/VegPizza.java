package creational.builder;

public class VegPizza extends Pizza {

    @Override
    public double getPrice() {
        return 1500;
    }

    @Override
    public String getName() {
        return "Veg Pizza";
    }

}
