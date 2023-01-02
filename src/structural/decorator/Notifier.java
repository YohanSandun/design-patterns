package structural.decorator;

public class Notifier implements INotifier {

    @Override
    public void notifyMessage(String message) {
        System.out.println("Main : " + message);
    }
}
