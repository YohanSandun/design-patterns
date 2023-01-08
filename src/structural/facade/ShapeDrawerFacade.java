package structural.facade;

public class ShapeDrawerFacade {

    private ShapeDrawer drawer = new ShapeDrawer();

    public void drawRectangle(int width, int height) {
        drawer.drawRectangle(
                0, 0,
                width, height,
                "red", 10
        );
    }

}
