package structural.facade;

public class FacadePatternTest {

    public static void main(String[] args) {

        ShapeDrawerFacade shapeDrawer = new ShapeDrawerFacade();
        shapeDrawer.drawRectangle(10,10);

    }

}
