package structural.facade;

public class ShapeDrawer {

    public void drawSquare(int x, int y, int width, int height, String color, int strokeWidth) {
        System.out.printf("Drawing square at(%d, %d)\n\twidth: %d\n\t height :%d\n\t color: %s\n\t stroke width: %d", x, y, width, height, color, strokeWidth);
    }

}
