package structural.facade;

public class ShapeDrawerFacade {

    private ShapeDrawer drawer = new ShapeDrawer();

    public void drawSquare(int width, int height) {
        drawer.drawSquare(
                0, 0,
                width, height,
                "red", 10
        );
    }

}
