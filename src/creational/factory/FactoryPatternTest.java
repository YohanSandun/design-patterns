package creational.factory;

public class FactoryPatternTest {

    public static void main(String[] args) {

        ChairFactory factory = new ChairFactory();

        IChair wooden = factory.createChair("wood");
        IChair metal  = factory.createChair("metal");

        wooden.printName();
        metal.printName();

    }

}
