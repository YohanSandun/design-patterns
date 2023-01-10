package creational.prototype;

public class PrototypePatternTest {

    public static void main(String[] args) {

        ShapeCache cache = new ShapeCache();
        cache.initializeCache();

        Shape circle = cache.getShape(Shape.ShapeType.CIRCLE);
        circle.draw();

        Shape rect = cache.getShape(Shape.ShapeType.RECTANGLE);
        rect.draw();

        Shape tri = cache.getShape(Shape.ShapeType.TRIANGLE);
        tri.draw();

    }

}
