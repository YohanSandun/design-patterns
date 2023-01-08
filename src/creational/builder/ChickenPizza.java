package creational.builder;

public class ChickenPizza extends Pizza {

    @Override
    public double getPrice() {
        return 3000;
    }

    @Override
    public String getName() {
        return "Chicken Pizza";
    }

}
