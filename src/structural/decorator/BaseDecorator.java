package structural.decorator;

public abstract class BaseDecorator implements INotifier {

    private INotifier notifier;

    public BaseDecorator(INotifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void notifyMessage(String message) {
        notifier.notifyMessage(message);
    }
}
