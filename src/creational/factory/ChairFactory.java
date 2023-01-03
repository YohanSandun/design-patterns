package creational.factory;

public class ChairFactory {

    public IChair createChair(String type) {
        if (type.equalsIgnoreCase("WOOD"))
            return new WoodenChair();
        else if (type.equalsIgnoreCase("METAL"))
            return new MetallicChair();
        return null;
    }

}
