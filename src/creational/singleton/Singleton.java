package creational.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello World from Singleton");
    }

}
