package creational.prototype;

public abstract class Shape implements Cloneable {

    public abstract void draw();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
