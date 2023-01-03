package creational.singleton;

public class SingletonPatternTest {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.sayHello();

    }

}
