package creational.prototype;

public abstract class Shape implements Cloneable {

    public enum ShapeType {
        CIRCLE, RECTANGLE, TRIANGLE
    }

    public abstract void draw();

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (Exception ignore) {
            return null;
        }
    }
}
