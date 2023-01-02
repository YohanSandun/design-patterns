package structural.decorator;

public class DecoratorPatternTest {

    public static void main(String[] args) {

        // Basic notifier
        INotifier notifier = new Notifier();
        notifier.notifyMessage("Hello World!");
        System.out.println();

        // Facebook + basic notifier
        INotifier notifier1 = new FacebookDecorator(new Notifier());
        notifier1.notifyMessage("Hello World!");
        System.out.println();

        // WhatsApp + basic notifier
        INotifier notifier2 = new WhatsAppDecorator(new Notifier());
        notifier2.notifyMessage("Hello World!");
        System.out.println();

        // Facebook + WhatsApp + basic notifier
        INotifier notifier3 = new FacebookDecorator(new WhatsAppDecorator(new Notifier()));
        notifier3.notifyMessage("Hello World!");
        System.out.println();

    }

}
