package Veeru.sample.singleton;

public class SingletonExample {

    private static  SingletonExample singletonExample;

    private SingletonExample() {
        System.out.println("I'm inside my singleton constructor");
    }

    public static SingletonExample getSingletonExample() {
        System.out.println("Insdie get Singletone Example");
        if (singletonExample == null) {
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }

}
