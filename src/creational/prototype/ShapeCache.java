package creational.prototype;

import java.util.HashMap;

public class ShapeCache {

    private HashMap<Shape.ShapeType, Shape> shapes = new HashMap<>();

    public void initializeCache() {
        Shape circle = new Circle();
        shapes.put(Shape.ShapeType.CIRCLE, circle);

        Shape rect = new Rectangle();
        shapes.put(Shape.ShapeType.RECTANGLE, rect);

        Shape tri = new Triangle();
        shapes.put(Shape.ShapeType.TRIANGLE, tri);
    }

    public Shape getShape(Shape.ShapeType type) {
        Shape shape = shapes.get(type);
        return (Shape)shape.clone();
    }

}
