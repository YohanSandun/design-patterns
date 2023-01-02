package structural.decorator;

public class WhatsAppDecorator extends BaseDecorator {

    public WhatsAppDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void notifyMessage(String message) {
        super.notifyMessage(message);
        System.out.println("WhatsApp : " + message);
    }
}
