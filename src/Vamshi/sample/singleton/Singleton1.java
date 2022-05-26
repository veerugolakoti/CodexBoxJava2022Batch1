package Vamshi.sample.singleton;

public class Singleton1 {
    public static Singleton1 singleton;
    private Singleton1(){
        System.out.println("singleton");
    }
    public static Singleton1 getSingleton(){
        if (singleton==null){
            singleton = new Singleton1();
        }
        return singleton;
    }
}
