package structural.adapter;

public class AdapterPatternTest {

    public static void main(String[] args) {

        Keyboard keyboard = new KeyboardAdapter();
        keyboard.type("Hello World");

    }

}
