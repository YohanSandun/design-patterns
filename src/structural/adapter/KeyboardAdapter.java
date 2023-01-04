package structural.adapter;

public class KeyboardAdapter implements Keyboard {

    private final TypeWriter typeWriter = new TypeWriter();

    @Override
    public void type(String text) {
        typeWriter.type(text);
    }
}
