package structural.decorator;

public class FacebookDecorator extends BaseDecorator {

    public FacebookDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void notifyMessage(String message) {
        super.notifyMessage(message);
        System.out.println("Facebook : " + message);
    }
}
